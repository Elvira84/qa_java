import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)

public class FelineTest {
    @Spy
    Feline feline;

    @Test
    public void felineEatMeatTest() throws Exception {
        feline.eatMeat();
        Mockito.verify(feline).getFood("Хищник");
    }

    @Test
    public void felineGetFamilyTest() {
        String expected = "Кошачьи";
        String actual = feline.getFamily();
        Mockito.verify(feline).getFamily();
        assertEquals("Семейство - не кошачьи", expected, actual);
    }

    @Test
    public void felineGetKittensTest() {
        int actual = feline.getKittens();
        assertEquals("Неверное количество котят", 1, actual);
    }

    @Test
    public void felineGetKittensTestWithParameters() {
        int kittensCount = 4;
        int actual = feline.getKittens(kittensCount);
        assertEquals("Неверное количество котят", kittensCount, actual);
    }

}
