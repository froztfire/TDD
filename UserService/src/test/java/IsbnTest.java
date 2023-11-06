import com.csvmasterstdd.service.Isbn;
import com.csvmasterstdd.service.IsbnCleanService;
import com.csvmasterstdd.service.IsbnValidator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IsbnTest {

    @DisplayName("Hyphen are removed in Input ISBN String")
    @Test
    void isbnClean_WhenInputIsbn10_shouldRemovedAllHyphen(){
        //Arrange
        IsbnCleanService isbnCleanService = new IsbnCleanService();
        Isbn isbn =  Isbn.of("0-9320-2342-4");
        String isbnExpected = "0932023424";

        //Act
        String isbnCleanedActual = isbnCleanService.isbnClean(isbn);

        //Assert
        assertEquals(isbnExpected,isbnCleanedActual,"Reformatting of Input ISBN is not proper.!");
    }

    @DisplayName("Spaces are removed in Input ISBN String")
    @Test
    void isbnClean_WhenInputIsbn10_shouldRemovedAllSpaces(){
        //Arrange
        IsbnCleanService isbnCleanService = new IsbnCleanService();
        Isbn isbn =  Isbn.of("0-9320-2342-4");
        String isbnExpected = "0932023424";

        //Act
        String isbnCleanedActual = isbnCleanService.isbnClean(isbn);

        //Assert
        assertEquals(isbnExpected,isbnCleanedActual,"Reformatting of Input ISBN is not proper.!");
    }

    @DisplayName("The Input ISBN-10 Not Equal 10 digits")
    @Test
    void isbnClean_WhenIsbn10NotEqualTen_shouldReturnFalse(){
        //Arrange
        IsbnCleanService isbnCleanService = new IsbnCleanService();
        Isbn isbn =  Isbn.of("0-9320-2342-4");
        boolean expected = false;
        //Act
        boolean actual = isbnCleanService.isEqualTen(isbn);
        //Assert
        assertEquals(expected, actual, "Result is expected false");
    }

    @DisplayName("The Input Isbn is Valid")
    @Test
    void isbnIsValid_WhenIsbn10SisValid_ShouldReturnTrue(){
        //Arrange
        IsbnCleanService isbnCleanService = new IsbnCleanService();
        IsbnValidator validator = new IsbnValidator();
        Isbn isbn =  Isbn.of("0-9320-2342-4");
        //Act
        boolean actual = validator.isbnIsValid(isbn);
        //Assert
        assertTrue(actual);

    }
}
