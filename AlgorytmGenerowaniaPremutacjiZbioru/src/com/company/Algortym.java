package com.company;

public class Algortym {

    private int permutacjeSize;
    private String zbior,zbior2;
    private int największeAJ;
    private int największeJ;
    private int najnajmniejszeAK;
    private int najmniejszeK;


    public void LiczPermutacje(String zbior){
        permutacjeSize = zbior.length();
        XElementowy(zbior, permutacjeSize);
    }

    private void XElementowy(String zbior, int x){
        System.out.print(zbior + " ");
        for(int i=0;i<silnia(x);i++){
            zbior2=zbior;
            for(int j=0;j<permutacjeSize;j++){
                if (j+1!=permutacjeSize && zbior.charAt(j)-'0' < zbior.charAt(j + 1)-'0') {
                    największeAJ = zbior.charAt(j)-'0';
                    największeJ = j;
                }
            }
            for(int k=największeJ;k<permutacjeSize;k++){
                if(zbior.charAt(k)-'0' > największeAJ){
                    najnajmniejszeAK = zbior.charAt(k)-'0';
                    najmniejszeK = k;
                }
            }
            zbior = swap(zbior,największeJ,najmniejszeK);
            zbior = reverse(zbior,największeJ,permutacjeSize);
            if(zbior.equals(zbior2)){
                break;
            }
            System.out.print(zbior);
            System.out.print(" ");
        }

    }
    private int silnia(int s){
        int wynik =1;
        for(int i=1;i<=s;i++){
            wynik*=i;
        }
        return wynik-1;
    }
    private static String swap(String str, int i, int j)
    {
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(i, str.charAt(j));
        sb.setCharAt(j, str.charAt(i));
        return sb.toString();
    }
    private static String reverse(String str,int k, int permutacjeSize)
    {
        String firstPart;
        String secoundPart;
            firstPart = new StringBuilder(str.substring(0, k+1)).toString();
            //System.out.print(firstPart + "f ");
            secoundPart = new StringBuilder(str.substring(k+1, permutacjeSize)).reverse().toString();
            //System.out.print(secoundPart + "s ");
        String allParts = firstPart+secoundPart;
        return allParts;
    }

}
