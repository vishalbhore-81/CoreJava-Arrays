public class Main {
    public static void main(String[] args) {
        Card [] cards = new Card[3];

        for(int i = 0; i < cards.length; i++) {
            System.out.println( cards[i] );
        }

        cards[0] = new Card("1233", 1);
        cards[1] = new Card("4596", 2);
        cards[2] = new Card("2207", 1);

        for(int i = 0; i < cards.length; i++) {
            cards[i].display();
        }
    }


    public static void main3(String[] args) {
        int [][] arr = new int[4][];
        arr[0] = new int[3];
        arr[1] = new int[2];
        arr[2] = new int[4];
        arr[3] = new int[1];

        System.out.println(arr.length);
        System.out.println(arr[0].length + " " + arr[1].length + " " + arr[2].length + " " + arr[3].length + " ");

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print( arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }


    public static void main2(String[] args) {
        //int [][] arr = new int[4][3];
        int [][] arr = new int[][] {
                {11, 22, 33},
                {44, 55, 66},
                {77, 88, 99},
                {100, 110, 120}
        };

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print( arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }


    public static void main1(String[] args) {
        int [] arr1 = new int[5];

        for(int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        System.out.println();

        for(int i = 0; i < arr1.length; i++) {
            arr1[i] = i * 10;
        }

        for(int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        System.out.println();

        arr1 = new int[] {11, 22, 33};
        for(int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        System.out.println();

        //System.out.println("3: " + arr1[3]); //Exception
    }
}