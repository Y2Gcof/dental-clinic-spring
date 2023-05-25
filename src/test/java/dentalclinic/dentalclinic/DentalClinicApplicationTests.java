package dentalclinic.dentalclinic;


import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc

class DentalClinicApplicationTests {
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void shouldReturnDefaultMessage() throws Exception {
		this.mockMvc.perform(get("/date"))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect(content().string(containsString("Запись")));
	}

	@Test
	public void shouldReturnDefaultMessage2() throws Exception {
		this.mockMvc.perform(get("/faqs"))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect(content().string(containsString("Ответы")));
	}
	@Test
	public void shouldReturnDefaultMessage3() throws Exception {
		this.mockMvc.perform(get("/about"))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect(content().string(containsString("Страница про нас")));
	}

}
