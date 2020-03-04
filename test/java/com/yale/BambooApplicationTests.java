// package com.yale;
// import com.yale.bamboo.web.UserController;
// import org.junit.Before;
// import org.junit.Test;
// import org.junit.runner.RunWith;
// import org.springframework.boot.test.SpringApplicationConfiguration;
// import org.springframework.mock.web.MockServletContext;
// import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
// import org.springframework.test.context.web.WebAppConfiguration;
// import org.springframework.test.web.servlet.MockMvc;
// import org.springframework.test.web.servlet.setup.MockMvcBuilders;

// @RunWith(SpringJUnit4ClassRunner.class)
// @SpringApplicationConfiguration(classes = MockServletContext.class)
// @WebAppConfiguration
// public class BambooApplicationTests {
//     private MockMvc mvc;
//     @Before
//     public void setUp() throws Exception{
//         MockMvcBuilders.standaloneSetup(new UserController()).build();
//     }

//     @Test
//     public void getUserList() throws Exception{
//       /*  mvc.perform(MockMvcRequestBuilders.get("/users"))
//                 .andExpect(status().isOk())
//                 .andExpect(content().string(equalTo("")));*/
//     }
// }
