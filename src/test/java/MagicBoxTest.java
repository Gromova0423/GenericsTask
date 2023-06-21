import org.junit.jupiter.api.*;

class MagicBoxTest {

    @Test
    void addTest_Test() {
        MagicBox.itemsTest = new int[]{5};
        int a = 4;
        boolean result = MagicBox.addTest(a);
        Assertions.assertEquals(false, result);
    }

    @BeforeEach
    void BeforeEach() {
        MagicBox magicBox = new MagicBox(1000000);
        System.out.println("Вызывем каждый раз перед тестом");
    }

    @AfterEach
    void AfterEach() {
        System.out.println("Вызываем после каждого метода");
    }


}