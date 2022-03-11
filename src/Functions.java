public class Functions {
    public static void main(String[] args) {
        double circleArea = GetAreaCircle(3);
        System.out.println(circleArea);

        double sphereArea = GetSphereArea(3);
        System.out.println(sphereArea);

        double sphereVolume = GetSphereVolume(3);
        System.out.println(sphereVolume);


    }
    public  static double GetAreaCircle(double radius){
        return Math.PI * Math.pow(radius, 2);
    }

    public static double GetSphereArea(double radius){
        return 4 * Math.PI * Math.pow(radius, 2);
    }
    public static double GetSphereVolume(double radius){
        return (4/3) * Math.PI * Math.pow(radius, 3);
    }
}
