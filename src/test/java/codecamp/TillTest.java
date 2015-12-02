package codecamp;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TillTest {
    @Test
    public void scanAppleAdds100() {
        Till sut = new Till();
        sut.scanApple();
        assertThat(sut.getAmount(), is(100));
    }

    @Test
    public void scanBananasAdds150() {
        Till sut = new Till();
        sut.scanBanana();
        assertThat(sut.getAmount(), is(150));
    }

    @Test
    public void scanTwoBananasAdds0() {
        Till sut = new Till();
        sut.scanBanana();
        sut.scanBanana();
        assertThat(sut.getAmount(), is(150));
    }

    @Test
    public void scanCherriesAdds75() {
        Till sut = new Till();
        sut.scanCherries();
        assertThat(sut.getAmount(), is(75));
    }

    @Test
    public void scanTwoCherriesAdds120() {
        Till sut = new Till();
        sut.scanCherries();
        sut.scanCherries();
        assertThat(sut.getAmount(), is(120));
    }
}