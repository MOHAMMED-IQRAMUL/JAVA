public class BinaryDecimal {
    public static StringBuilder DecTOBin(int dec) {
        StringBuilder Bin = new StringBuilder("");
        while (dec != 0) {
            int rem = dec % 2;
            dec /= 2;
            Bin.append(rem);
        }
        for (int i = Bin.length(); i <= 8; i++) {
            Bin.append(0);
        }
        return Bin.reverse();
    }

    public static int BinToDec(StringBuilder bi) {
        int bin = Integer.parseInt(bi.toString());
        int dec = 0;
        int i = 0;
        while (bin != 0) {
            int lsb = bin % 10;
            dec += (int) (lsb * Math.pow(2, i++));
            bin = bin / 10;
        }
        return dec;
    }

    public static void main(String[] args) {
        System.out.println(DecTOBin(5));
        System.out.println(BinToDec(new StringBuilder("101")));
        System.out.println();
        System.out.println(BinToDec(new StringBuilder(DecTOBin(50))));
        System.out.println(BinToDec(new StringBuilder(DecTOBin(23))));
        System.out.println(BinToDec(new StringBuilder(DecTOBin(49))));
        System.out.println();
        System.out.println(DecTOBin(BinToDec(new StringBuilder("0101010"))));
        System.out.println(DecTOBin(BinToDec(new StringBuilder("10001"))));
        System.out.println(DecTOBin(BinToDec(new StringBuilder("11111"))));

    }
}
