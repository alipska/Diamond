import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class DiamondTest {

    Diamond diamond;
    @Before
    public void setUp() throws Exception {
        diamond = new Diamond();

    }

    @Test
    public void diamondForA() throws Exception {

        assertThat(diamond.print('A').get(0)).isEqualTo("A");

    }



    @Test
    public void diamondForBShouldContainThreeLines() throws Exception {

        assertThat(diamond.print('B').size()).isEqualTo(3);

    }

    @Test
    public void firstLineForB() throws Exception {

        assertThat(diamond.print('B').get(0)).isEqualTo("-A-");

    }

    @Test
    public void secondLineForBShouldContainB() throws Exception {

        assertThat(diamond.print('B').get(1)).contains("B");

    }

    @Test
    public void secondLineForBShouldBeOK() throws Exception {

        assertThat(diamond.print('B').get(1)).contains("B-B");
    }

    @Test
    public void diamondForCShouldContainFiveLines() throws Exception {

        assertThat(diamond.print('C').size()).isEqualTo(5);

    }

    @Test
    public void secondLineForCShouldBeOK() throws Exception {

        assertThat(diamond.print('C').get(1)).contains("-B-B-");
    }

    @Test
    public void thirdLineForCShouldBeOK() throws Exception {

        assertThat(diamond.print('C').get(2)).isEqualTo("C---C");
    }

    @Test
    public void thirdLineForDShouldBeOK() throws Exception {

        assertThat(diamond.print('D').get(2)).isEqualTo("-C---C-");
    }

    @Test
    public void print_all_for_C() throws Exception {
        assertThat(diamond.print('C').get(0)).isEqualTo("--A--");
        assertThat(diamond.print('C').get(1)).isEqualTo("-B-B-");
        assertThat(diamond.print('C').get(2)).isEqualTo("C---C");
        assertThat(diamond.print('C').get(3)).isEqualTo("-B-B-");
        assertThat(diamond.print('C').get(4)).isEqualTo("--A--");
    }
}