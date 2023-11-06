import com.csvmasterstdd.service.IsbnCleanService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IsbnTest {

    @DisplayName("Hyphen are removed in Input ISBN String")
    @Test
    void isbnCleanService_WhenInputIsbn10_shouldRemovedAllHyphen(){
        //Arrange
        IsbnCleanService isbnCleanService = new IsbnCleanService();
        String isbnWithHyphen = "0-9320-2342-4";
        String isbnExpected = "0932023424";

        //Act
        String isbnCleanedActual = isbnCleanService.isbnClean(isbnWithHyphen);

        //Assert
        assertEquals(isbnExpected,isbnCleanedActual,"Reformatting of Input ISBN is not proper.!");
    }

    @DisplayName("Spaces are removed in Input ISBN String")
    @Test
    void isbnCleanService_WhenInputIsbn10_shouldRemovedAllSpaces(){
        //Arrange
        IsbnCleanService isbnCleanService = new IsbnCleanService();
        String isbnWithHyphen = "0 9320 2342 4";
        String isbnExpected = "0932023424";

        //Act
        String isbnCleanedActual = isbnCleanService.isbnClean(isbnWithHyphen);

        //Assert
        assertEquals(isbnExpected,isbnCleanedActual,"Reformatting of Input ISBN is not proper.!");
    }
}
