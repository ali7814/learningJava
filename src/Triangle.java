public class Triangle {
    static int numOfSides = 3;
    double base;
    double height;
    double sideLenOne;
    double getSideLenTwo;
    double getSideLenThree;

    public Triangle(double base, double height,
                    double sideLenOne, double getSideLenTwo,
                    double getSideLenThree){
        this.base = base;
        this.height= height;
        this.sideLenOne= sideLenOne;
        this.getSideLenTwo = getSideLenTwo;
        this.getSideLenThree= getSideLenThree;
    }
    public  double findArea(){
       return (this.base * this.height) /2;
    }
}
