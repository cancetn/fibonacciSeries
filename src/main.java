import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        //Patika.dev egitim kampi proje odevidir.
        /* Java döngüler ile fibonacci serisi bulan program yazıyoruz. Fibonacci serisinin eleman sayısını kullanıcıdan alın.

           Fibonacci Serisi Nedir ?

           Fibonacci serisi, her sayının kendinden önceki ile toplanması sonucu oluşan bir sayı dizisidir.
           Bu şekilde devam eden bu dizide sayılar birbirleriyle oranlandığında altın oran ortaya çıkar,
           yani bir sayı kendisinden önceki sayıya bölündüğünde altın orana gittikçe yaklaşan bir dizi elde edilir.

           Fibonacci dizisi, 0'dan başlar ve sonsuza kadar. Her rakam, bir önceki rakamla toplanır.
           Elde edilen sonuç rakamın sağ tarafına yazılır. Fibonacci dizisinin ilk on sayısı şu şekildedir:

           9 Elemanlı Fibonacci Serisi : 0 1 1 2 3 5 8 13 21 34
           */

        int basamak, sayi1=0, sayi2=1, sayi3;

        Scanner inp = new Scanner(System.in);

        System.out.println("Serinin ilerleyecegi adim sayisini giriniz = ");

        basamak = inp.nextInt();

        System.out.println(sayi1 +" "+ sayi2+ " ");

        for(int i=2; i<=basamak;i++){

            sayi3 = sayi1 + sayi2;
            System.out.println(sayi3 + " ");
            sayi1= sayi2;
            sayi2 = sayi3;

        }



    }
}
