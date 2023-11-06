import com.csvmasterstdd.service.IsbnCleanService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IsbnTest {

    @DisplayName("Hyphen and Whitespace are removed in Input String")
    @Test
    void isbnCleanUp_WhenInputIsbn10_shouldRemovedAllSpacesAndHyphen(){
        //Arrange
        IsbnCleanService isbnCleanService = new IsbnCleanService();
        String isbn = "0-9320-2342-4";
        String isbnExpected = "0932023424";

        //Act
        String isbnCleanedActual = isbnCleanService.isbnClean(isbn);

        //Assert
        assertEquals(isbnExpected,isbnCleanedActual,"Reformatting of Input ISBN is not proper.!");

    }
}
