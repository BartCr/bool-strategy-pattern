import ducks.Duck;
import ducks.FeetlessDuck;
import ducks.NormalDuck;
import ducks.WinglessDuck;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DuckTest {

    private NormalDuck normalDuck;
    private WinglessDuck winglessDuck;
    private FeetlessDuck feetlessDuck;

    @Before
    public void setUp() throws Exception {
        normalDuck = new NormalDuck("normie");
        winglessDuck = new WinglessDuck("wingie");
        feetlessDuck = new FeetlessDuck("footsie");
    }

    @Test
    public void normalDuck_doesNormalDuckThings() {
        assertThat(normalDuck).isInstanceOf(Duck.class);

        assertThat(normalDuck.walk()).isEqualTo("normie is walking around happy as a duck can be");
        assertThat(normalDuck.fly()).isEqualTo("normie is flying around happy as a duck can be");
        assertThat(normalDuck.swim()).isEqualTo("normie is swimming around happy as a duck can be");
        assertThat(normalDuck.sleep()).isEqualTo("normie is dreaming happy as a duck can be");
        assertThat(normalDuck.quack()).isEqualTo("quack quack my name is normie");

    }

    @Test
    public void winglessDuck_doesWinglessDuckThings() {
        assertThat(winglessDuck).isInstanceOf(Duck.class);

        assertThat(winglessDuck.walk()).isEqualTo("wingie is walking around happy as a duck can be");
        assertThat(winglessDuck.fly()).isEqualTo("flying without wings, they are numb so i don't feel a thing");
        assertThat(winglessDuck.swim()).isEqualTo("wingie is swimming like Michael Phelps");
        assertThat(winglessDuck.sleep()).isEqualTo("wingie is dreaming happy as a duck can be");
        assertThat(winglessDuck.quack()).isEqualTo("quack quack my name is wingie");

    }

    @Test
    public void feetlessDuck_doesFeetlessDuckThings() {
        assertThat(feetlessDuck).isInstanceOf(Duck.class);

        assertThat(feetlessDuck.walk()).isEqualTo("no walks in the park for me");
        assertThat(feetlessDuck.fly()).isEqualTo("footsie is flying around happy as a duck can be");
        assertThat(feetlessDuck.swim()).isEqualTo("footsie is floating like rubber a duck");
        assertThat(feetlessDuck.sleep()).isEqualTo("footsie is dreaming happy as a duck can be");
        assertThat(feetlessDuck.quack()).isEqualTo("quack quack my name is footsie");

    }
}