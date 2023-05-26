public class ForWaterOnly {

    ForWaterOnly a = new Fish();
    ForWaterOnly b  = new Croc();

    executeForWaterOnly(a);
    executeForWaterOnly(b);

}

    static void executeForWaterOnly(ForWaterOnly f) {
    f.swim();
    }
}