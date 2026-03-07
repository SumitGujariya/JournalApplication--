package net.sumityouhub.journalApp.service;

import net.sumityouhub.journalApp.repository.UserRepository;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class UserServiceTests {

    @Autowired
    private UserRepository userRepository;

//    @Test  // This test annotation we use to check the normal test cases.
//    You also use this sources method to check the value
//    @EnumSource({})
//    @ValueSource({})

    @ParameterizedTest // You pass the parameter and check which is exit in the database.
    @CsvSource({
            "ram",
            "raghav",
            "sumit"
    })
    public void testFindByUserName(String name) {

        assertNotNull(userRepository.findByUserName(name));

//        User user = userRepository.findByUserName("ram");
//        assertTrue(!user.getJournalEntries().isEmpty());

    }


    // Another test case with given value and expected value
//    @Disabled // You just disabled the with the help of this annotation.
    @ParameterizedTest
    @CsvSource({
            "1,1,2",
            "4,4,8",
            "3,3,9"
    })
    public void test(int a, int b, int expected) {
        assertEquals(expected, a + b);
    }
}
