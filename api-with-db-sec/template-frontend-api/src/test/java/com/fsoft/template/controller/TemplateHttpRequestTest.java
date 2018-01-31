package com.fsoft.template.controller;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.DefaultMockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fsoft.template.request.UserRegistryRequest;

/*@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@WebAppConfiguration
@ImportResource("classpath:application-config.xml")
@PropertySource("classpath:application.properties")
@EnableAutoConfiguration(exclude={
    DataSourceAutoConfiguration.class,
    JpaRepositoriesAutoConfiguration.class,
    HibernateJpaAutoConfiguration.class,
    DataSourceTransactionManagerAutoConfiguration.class,
    org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration.class
})
public class TemplateHttpRequestTest {
  
    final static Logger logger = LoggerFactory.getLogger(TemplateHttpRequestTest.class);
  
    @Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;
    
    @Before
    public void setup () {
        DefaultMockMvcBuilder builder = MockMvcBuilders.webAppContextSetup(this.wac);
        this.mockMvc = builder.build();
    }

    @Test
    public void test() throws Exception {
      assertNotNull(mockMvc);
      
      ResultMatcher ok = MockMvcResultMatchers.status().isOk();
      
      UserRegistryRequest request = new UserRegistryRequest();
      request.setUsername("test" + System.currentTimeMillis());
      request.setPassword("123456");
      request.setRePassword("123456");
      request.setEmail("vana@gmail.com");
      request.setFullname("Nguyen Van A");
      request.setPhone("099654991");
      
      ObjectMapper mapper = new  ObjectMapper();
      String json = mapper.writeValueAsString(request);
      
      MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.post("/user/registry");
      builder = builder.content(json).contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON);
      
      ResultActions actions = this.mockMvc.perform(builder);
      logger.info("--->" + actions.andReturn().getResponse().getContentAsString());
      actions.andExpect(ok);
    }
}*/