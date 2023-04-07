package com.artsiomhanchar.lectures.section_5_numbers;

public class Exercise {
    public static void main(String[] args) {
        System.out.println(calculateAreaOfCircle(3));

        double radius = 0.8;
        double period = 3;
        double mass = .2;

        double velocity = calculatePathVelocity(radius, period);
        System.out.println(velocity);

        double centripetalAcceleration = calculateCentripetalAcceleration(velocity, radius);
        System.out.println(centripetalAcceleration);

        double centripetalForce = calculateCentripetalForce(mass, centripetalAcceleration);
        System.out.println(centripetalForce);

        System.out.println(calculateCentripetalForce(mass, radius, period));
    }

    /**
     * This method calculate area of circe.
     * It this use the formula: A = PI * r^2
     * @param radius
     * @return
     */
    public static double calculateAreaOfCircle(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    private static double calculatePathVelocity(double radius, double period) {
        double circumference = 2 * Math.PI * radius;

        return  circumference / period;
    }

    private static double calculateCentripetalAcceleration(double velocity, double radius) {
        double centripetalAcceleration = Math.pow(velocity, 2) / radius;

        return centripetalAcceleration;
    }

    private static double calculateCentripetalForce(double mass, double centripetalAcceleration) {
        double centripetalForce = mass * centripetalAcceleration;

        return centripetalForce;
    }

    public static double calculateCentripetalForce(double mass, double radius, double period) {
        double velocity = calculatePathVelocity(radius, period);
        double centripetalAcceleration = calculateCentripetalAcceleration(velocity, radius);
        double centripetalForce = calculateCentripetalForce(mass, centripetalAcceleration);

        return centripetalForce;
    }
}
