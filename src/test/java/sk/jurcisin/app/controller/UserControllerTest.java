package sk.jurcisin.app.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.client.model.UserRequestDto;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import sk.jurcisin.app.service.UserService;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(MockitoJUnitRunner.class)
public class UserControllerTest {

    private MockMvc mockMvc;

    @Mock
    private UserService userService;

    @InjectMocks
    private UserController userController;

    @Before
    public void init() {
        mockMvc = MockMvcBuilders
                .standaloneSetup(userController)
                .build();
    }

    @Test
    public void userControllerTest() throws Exception {
        UserRequestDto userRequestDto = new UserRequestDto();
        userRequestDto.setId(1L);
        userRequestDto.setFirstName("Janko");
        userRequestDto.setLastName("Mrkvicka");

        mockMvc.perform(
                post("/v2/user")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(asJsonString(userRequestDto)))
                .andDo(print())
                .andExpect(status().isOk());
    }

    private String asJsonString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
