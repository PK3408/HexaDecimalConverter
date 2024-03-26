public class Hexadecimal{

//turn a one digit 
public static String bitConverter(int a){

    //return a fourdigitnum
    String fourdigitnum = "";

    //divide the number by 8, 4, 2 and 1 respectively if the answer is greater then one return a 1, else return a 0, subtract number if divisible
    if(a/8 == 1){

        fourdigitnum += '1';
        a -= 8;

    }
    else{

        fourdigitnum += '0';
    }

    if(a/4 == 1){

        fourdigitnum += '1';
        a -= 4;

    }
    else{

        fourdigitnum += '0';
    }
    if(a/2 == 1){

        fourdigitnum += '1';
        a -= 2;

    }
    else{

        fourdigitnum += '0';
    }
    if(a/1 == 1){

        fourdigitnum += '1';
        a -= 1;

    }
    else{

        fourdigitnum += '0';
    }

    //return string
    return fourdigitnum;



} 



public static void main(String[] args){

// macrocode 
String[] hex = {"0xC050005C",
"0x4B060000",
"0x4B010000",
"0x4B000000",
"0x4F0A005C",
"0x4F0D00DC",
"0x4C0A0004",
"0xC0BA0000",
"0x42BD0000",
"0x4C0D0004",
"0x4C060001",
"0x10658000",
"0x56810018",
"0x4B060000",
"0x4F0900DC",
"0x43970000",
"0x05070000",
"0x4C060001",
"0x4C090004",
"0x10658000",
"0x5681003C",
"0xC10000AC",
"0x92000000"};

//store binary code
String[] binary = new String[hex.length];

//read each line then turn it into binary
for(int x = 0; x < hex.length; x++){

    //declare binary number to store 
    binary[x] = "";
    //start at 2 because 0x just means its hexadecimal
    for(int y = 2; y < hex[x].length(); y++){
        //convert hex digit to binary

        if(hex[x].charAt(y) == 'A'){

            binary[x] += bitConverter(10);

        }
        else if(hex[x].charAt(y) == 'B'){

            binary[x] += bitConverter(11);

        }
        else if(hex[x].charAt(y) == 'C'){

            binary[x] += bitConverter(12);

        }
        else if(hex[x].charAt(y) == 'D'){

            binary[x] += bitConverter(13);

        }
        else if(hex[x].charAt(y) == 'E'){

            binary[x] += bitConverter(14);

        }
        else if(hex[x].charAt(y) == 'F'){

            binary[x] += bitConverter(15);

        }
        else{
        binary[x] += bitConverter(Character.getNumericValue(hex[x].charAt(y)));
        }

    }
}

//print out binary numbers
System.out.println("binary");
for(int x = 0; x < binary.length; x++){
    System.out.println(binary[x]);
}

//print out type
System.out.println("type");
for(int x = 0; x < binary.length; x++){
    for(int y = 0; y < 2; y++){
        System.out.print(binary[x].charAt(y));
    }

    System.out.println();
}

//print out opcode
System.out.println("opcode");
for(int x = 0; x < binary.length; x++){
    for(int y = 2; y < 8; y++){
        System.out.print(binary[x].charAt(y));
    }

    System.out.println();
}

//print out reg1
System.out.println("reg1");
for(int x = 0; x < binary.length; x++){
    for(int y = 8; y < 12; y++){
        System.out.print(binary[x].charAt(y));
    }

    System.out.println();
}

//print out reg2
System.out.println("reg2");
for(int x = 0; x < binary.length; x++){
    for(int y = 12; y < 16; y++){
        System.out.print(binary[x].charAt(y));
    }

    System.out.println();
}

//print out address
System.out.println("address");
for(int x = 0; x < binary.length; x++){
    for(int y = 16; y < binary[x].length(); y++){
        System.out.print(binary[x].charAt(y));
    }

    System.out.println();
}

}
}