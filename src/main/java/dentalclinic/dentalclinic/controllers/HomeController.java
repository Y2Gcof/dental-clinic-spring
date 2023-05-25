package dentalclinic.dentalclinic.controllers;

import dentalclinic.dentalclinic.models.Appointment;

import dentalclinic.dentalclinic.models.Doctor;
import dentalclinic.dentalclinic.models.Feedback;
import dentalclinic.dentalclinic.repo.AppointmentRepository;
import dentalclinic.dentalclinic.repo.DoctorRepository;
import dentalclinic.dentalclinic.repo.FeedbackRepository;
import dentalclinic.dentalclinic.services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@ControllerAdvice
@Controller
public class HomeController {
//

    @Autowired
    private DoctorService doctorService;

    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Autowired
    private FeedbackRepository feedbackRepository;

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("title", "Главная страница");
        Iterable<Feedback> feedbacks = feedbackRepository.findAll();
        model.addAttribute("feedbacks", feedbacks);
        return "home";
    }
    @GetMapping("/faqs")
    public String faqs(Model model) {
        model.addAttribute("title", "Ответы");
        return "faqs";
    }

    @PostMapping("/home")
    public String addFeedback(@RequestParam String name, @RequestParam String feedback, Model model) {
        Feedback feedback1 = new Feedback(name,feedback);
        feedbackRepository.save(feedback1);
        return "redirect:/home";
    }

    @GetMapping("/date")
    public String date(Model model) {
        List<Doctor> doctors = doctorService.getAllDoctors();
        model.addAttribute("doctors", doctors);
        model.addAttribute("title", "Запись");
        return "date";
    }

    @PostMapping("/date")
    public String dateAdd(@RequestParam String patientName, @RequestParam String email, @RequestParam String phoneNumber, @RequestParam String textInfo,@RequestParam Long doctorid, Model model) {
        Appointment appointment = new Appointment(patientName,textInfo,phoneNumber,email,doctorid);
        appointmentRepository.save(appointment);
        return "redirect:/home";
    }

    @GetMapping("/about")
    public String about(Model model) {

        List<Doctor> doctors = doctorService.getAllDoctors();
        model.addAttribute("doctors", doctors);
        model.addAttribute("title", "Страница про нас");

        return "about";
    }


}