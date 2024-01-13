import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        final float pi = 3.14f;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите геометрическую фигуру:\n1.Треугольник\n2.Круг\n3.Прямоугольник\n4.Шар\n5.Треугольная призма\n6.Конус");
        byte num = scanner.nextByte();

        switch (num) {
            case 1:
                System.out.print("Введите сторону а: ");
                int a = scanner.nextByte();
                System.out.print("Введите сторону b: ");
                int b = scanner.nextByte();
                System.out.print("Введите сторону c: ");
                int c = scanner.nextByte();
                //Площадь
                int p = (a+b+c) / 2;
                double S = Math.sqrt(p*(p-a)*(p-b)*(p-c));
                //Периметр
                int P = a+b+c;
                System.out.println("Площадь треугольника: " + S + "\nПериметр треугольника: " + P);
                break;
            case 2:
                System.out.print("Введите радиус: ");
                int r = scanner.nextByte();
                //Площадь
                float S1 = pi*(r*r);
                //Периметр
                float i = 2*pi*r;
                System.out.println("Площадь круга: " + S1 + "\nПериметр(длина) круга: " + i);
                break;
            case 3:
                System.out.print("Введите длину: ");
                int ap = scanner.nextInt();
                System.out.print("Введите высоту: ");
                int bp = scanner.nextInt();
                //Площадь
                int Sp = ap*bp;
                //Периметр
                int Pp = 2*(ap+bp);
                System.out.println("Площадь прямоугольника: " + Sp + "\nПериметр прямоугольника: " + Pp);
                break;
            case 4:
                System.out.print("Введите радиус сферы: ");
                int R = scanner.nextByte();
                //Обьём
                float V = ((float) 4/3)*pi*(R*R);
                //Площадь поверхности
                float S2 = (float)4*pi*(R*R);
                System.out.println("Обьём сферы: " + V + "\nПлощадь поверхности сферы: " + S2);
                break;
            case 5:
                System.out.print("Введите высоту треугольной призмы: ");
                int h = scanner.nextInt();
                System.out.print("Введите сторону а для треугольника лежащего в основе треугольной призмы: ");
                int z = scanner.nextInt();
                System.out.print("Введите высоту треугольника лежащего в основе треугольной призмы: ");
                int q = scanner.nextInt();
                //Площадь треугольника лежащего в основании треугольной призмы
                float A = 0.5f*q*z;
                //Обьём
                float V2 = A*h;
                System.out.println("Площадь поверхности треугольной призмы: " + A + "\nОбьём треугольной призмы: " + V2);
                break;
            case 6:
                System.out.print("Введите радиус конуса: ");
                int rk = scanner.nextInt();
                System.out.print("Введите длину образующей конуса: ");
                int l = scanner.nextInt();
                System.out.print("Введите высоту конуса: ");
                int hk = scanner.nextInt();
                //Площадь поверхности
                float Sb = pi*rk*l;
                float sphere = pi*(rk*rk);
                float Sk = Sb + sphere;
                //Обьём
                float Vk = 0.3f*hk*sphere;
                System.out.println("Площадь поверхности конуса: " + Sk + "\nОбьём конуса: " + Sk);
                break;
            default:
                System.out.println("Вы ввели что-то не то");
        }
    }
}