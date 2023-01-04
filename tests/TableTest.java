import com.telerikacademy.furniture.models.TableImpl;
import com.telerikacademy.furniture.models.contracts.Table;
import com.telerikacademy.furniture.models.enums.MaterialType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TableTest {

    private static final int CODE_MIN_LENGTH = 3;
    private static final String VALID_MODEL_CODE = "x".repeat(CODE_MIN_LENGTH);
    private static final double VALID_PRICE = 0.1;
    private static final double VALID_HEIGHT = 0.1;
    private static final double VALID_LENGTH = 0.1;
    private static final double VALID_WIDTH = 0.1;

    Table table;
    @Before
    public void createTable(){
        table = new TableImpl(VALID_MODEL_CODE,
                VALID_PRICE,
                VALID_HEIGHT,
                MaterialType.WOODEN,
                VALID_LENGTH,
                VALID_WIDTH);
    }
    @Test
    public void tableImpl_Should_Implement_Table_Interface(){
        Assert.assertNotNull(table);
    }

    @Test
    public void constructor_Should_Throw_Exception_When_Length_Is_Invalid(){
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new TableImpl(VALID_MODEL_CODE,
                        VALID_PRICE,
                        VALID_HEIGHT,
                        MaterialType.WOODEN,
                        0,
                        VALID_WIDTH));
    }
    @Test
    public void constructor_Should_Throw_Exception_When_Width_Is_Invalid() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new TableImpl(
                        VALID_MODEL_CODE,
                        VALID_PRICE,
                        VALID_HEIGHT,
                        MaterialType.WOODEN,
                        VALID_LENGTH,
                        0));
    }
}
