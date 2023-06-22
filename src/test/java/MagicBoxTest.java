import org.junit.jupiter.api.*;

class MagicBoxTest {


    @Test
    void addTest_Test() {
        MagicBox.itemsTest = new int[]{5};
        int a = 4;
        boolean result = MagicBox.addTest(a);
        Assertions.assertFalse(result);
    }

    @Test
    void addTest_Test2() {
        MagicBox.itemsTest = new int[2];
        boolean result = MagicBox.addTest(0);
        Assertions.assertTrue(result);
    }

    @Test
    void pickTest_Test() {
        MagicBox.itemsTest = new int[]{1};
        int value = MagicBox.pickTest();
        Assertions.assertNotNull(value); //Проверить, что value не является null
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