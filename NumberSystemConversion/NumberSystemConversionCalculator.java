//Importing Package for InputOutput
import java.io.*;

class NumberSystemConversionCalculator{

    public static void main(String[] args) throws IOException{

        //Creating Object Of Class BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("\n\nNUMBER SYSTEM CONVERSION CALCULATOR");
        System.out.println("___________________________________");

        //variable declarations
        long num = 0;
        boolean exit = true;//Variable Exiting Infinite Loop

        //code
        System.out.println();

        do{

            //Variable Declarations for Exiting Loop
            boolean exit1 = true;//Variable Exiting Infinite Loop
            boolean exit2 = true;//Variable Exiting Infinite Loop
            boolean exit3 = true;//Variable Exiting Infinite Loop
            boolean exit4 = true;//Variable Exiting Infinite Loop


            //Accepting Input From User

            System.out.println("Select The Number System That The Number Belongs To");
            System.out.println("1. Binary Number System"+"\n"+"2. Octal Number System"+"\n"+"3. Decimal Number System"+"\n"+"4. Hexadecimal Number System"+"\n");
            System.out.println("Enter 0 To Exit");
            int choice1 = Integer.parseInt(br.readLine()); // Accepting INTEGER using BufferedReader

            System.out.println();

            switch(choice1){

                case 0:
                    //Exiting Condition
                    exit = false;

                    break;
                case 1 :
                    //if choice is binary
                    System.out.println("Enter The Number From The Selected Number System : ");
                    num = Integer.parseInt(br.readLine()); //Number To Be Converted
                    System.out.print("\n\n");

                    while(exit1 == true){
                        System.out.println("Select The Number System To Convert The Number To");
                        System.out.println("1. Octal Number System"+"\n"+"2. Decimal Number System"+"\n"+"3. Hexadecimal Number System"+"\n");
                        System.out.println("\nEnter 0 To Go Back To Main Menu");
                        int choiceBin = Integer.parseInt(br.readLine());// Accepting INTEGER using BufferedReader
                        System.out.println();

                        switch(choiceBin){

                            case 0 :
                                exit1 = false;

                                break;

                            case 1:
                                //Binary To Octal

                                //Binary to Decimal

                                //variable declarations
                                long baseBinToOct_BinToDec = 1;
                                long remBinToOct_BinToDec = 0;
                                long copyBinToOct_BinToDec = num;
                                long new_numBinToOct_BinToDec = 0;
                                long revBinToOct_BinToDec = 0;

                                for(int i = 1; copyBinToOct_BinToDec > 0; i++){

                                    remBinToOct_BinToDec = copyBinToOct_BinToDec % 10;
                                    copyBinToOct_BinToDec = copyBinToOct_BinToDec / 10;
                                    new_numBinToOct_BinToDec = new_numBinToOct_BinToDec + remBinToOct_BinToDec * baseBinToOct_BinToDec;
                                    baseBinToOct_BinToDec = baseBinToOct_BinToDec * 2;

                                }

                                //Decimal To Octal

                                //variable declarations
                                long remBinToOct_DecToOct = 0;
                                long copyBinToOct_DecToOct = new_numBinToOct_BinToDec;
                                long revBinToOct_DecToOct = 1;
                                long new_numBinToOct_DecToOct = 0;

                                for(int i = 1; copyBinToOct_DecToOct > 0; i++){

                                    remBinToOct_DecToOct = copyBinToOct_DecToOct % 8;
                                    copyBinToOct_DecToOct /= 8;
                                    new_numBinToOct_DecToOct = new_numBinToOct_DecToOct + remBinToOct_DecToOct * revBinToOct_DecToOct;
                                    revBinToOct_DecToOct *= 10;

                                }
                                System.out.println("Octal Number Is : "+new_numBinToOct_DecToOct);
                                System.out.println();



                                break;

                            case 2:
                                //Binary To Decimal

                                //variable declarations
                                long baseBinToDec = 1;
                                long remBinToDec = 0;
                                long copyBinToDec = num;
                                long new_numBinToDec = 0;
                                long revBinToDec = 0;

                                for(int i = 1; copyBinToDec > 0; i++){

                                    remBinToDec = copyBinToDec % 10;
                                    copyBinToDec = copyBinToDec / 10;
                                    new_numBinToDec = new_numBinToDec + remBinToDec * baseBinToDec;
                                    baseBinToDec = baseBinToDec * 2;

                                }
                                System.out.println("Decimal Number Is : "+new_numBinToDec);
                                System.out.println();


                                break;

                            case 3 :
                                //Binary To Hexadecimal

                                //First Binary To Decimal

                                //variable declarations
                                long baseBinToHex_BinToDec = 1;
                                long remBinToHex_BinToDec = 0;
                                long copyBinToHex_BinToDec = num;
                                long new_numBinToHex_BinToDec = 0;

                                for(int i = 1; copyBinToHex_BinToDec > 0; i++){

                                    remBinToHex_BinToDec = copyBinToHex_BinToDec % 10;
                                    copyBinToHex_BinToDec = copyBinToHex_BinToDec / 10;
                                    new_numBinToHex_BinToDec = new_numBinToHex_BinToDec + remBinToHex_BinToDec * baseBinToHex_BinToDec;
                                    baseBinToHex_BinToDec = baseBinToHex_BinToDec * 2;

                                }

                                //Second Decimal To Hexadecimal

                                //Variable declarations
                                long remBinToHex_DecToHex = 0;
                                long copyBinToHex_DecToHex = new_numBinToHex_BinToDec;
                                int countBinToHex_DecToHex = 0;
                                long remCountBinToHex_DecToHex = 0;

                                for(int i = 0; copyBinToHex_DecToHex > 0; i++){

                                    remCountBinToHex_DecToHex = copyBinToHex_DecToHex % 16;
                                    copyBinToHex_DecToHex /= 16;
                                    countBinToHex_DecToHex++;

                                }

                                //Array declarations
                                long remArrBinToHex_DecToHex[] = new long[countBinToHex_DecToHex];
                                String strBinToHex_DecToHex = "";

                                copyBinToHex_DecToHex = new_numBinToHex_BinToDec;
                                for(int i = 0; copyBinToHex_DecToHex > 0; i++){

                                    remBinToHex_DecToHex = copyBinToHex_DecToHex % 16;
                                    copyBinToHex_DecToHex /= 16;
                                    remArrBinToHex_DecToHex[i] = remBinToHex_DecToHex;

                                }

                                for(int i = (remArrBinToHex_DecToHex.length - 1); i >= 0; i--){

                                    if(remArrBinToHex_DecToHex[i] <= 9)
                                        strBinToHex_DecToHex = strBinToHex_DecToHex + remArrBinToHex_DecToHex[i];
                                    else{

                                        if(remArrBinToHex_DecToHex[i] == 10)
                                            strBinToHex_DecToHex = strBinToHex_DecToHex + (char)(remArrBinToHex_DecToHex[i] + 55);
                                        else if(remArrBinToHex_DecToHex[i] == 11)
                                            strBinToHex_DecToHex = strBinToHex_DecToHex + (char)(remArrBinToHex_DecToHex[i] + 55);
                                        else if(remArrBinToHex_DecToHex[i] == 12)
                                            strBinToHex_DecToHex = strBinToHex_DecToHex + (char)(remArrBinToHex_DecToHex[i] + 55);
                                        else if(remArrBinToHex_DecToHex[i] == 13)
                                            strBinToHex_DecToHex = strBinToHex_DecToHex + (char)(remArrBinToHex_DecToHex[i] + 55);
                                        else if(remArrBinToHex_DecToHex[i] == 14)
                                            strBinToHex_DecToHex = strBinToHex_DecToHex + (char)(remArrBinToHex_DecToHex[i] + 55);
                                        else if(remArrBinToHex_DecToHex[i] == 15)
                                            strBinToHex_DecToHex = strBinToHex_DecToHex + (char)(remArrBinToHex_DecToHex[i] + 55);
                                        else
                                            System.out.println("Error");


                                    }

                                }
                                System.out.println("Hexadecimal Number Is : "+ strBinToHex_DecToHex);
                                System.out.println();

                                break;

                            default :
                                System.out.println("Invalid Entry!!");

                                break;

                        }//end of Inner Switch case

                    }
                    System.out.println("======*======*======*======*======*======*======*======*=======*======*======*======*=======*======");
                    System.out.print("\n\n");

                    break;

                case 2:
                    //if choice is Octal
                    System.out.println("Enter The Number From The Selected Number System : ");
                    num = Integer.parseInt(br.readLine()); //Number To Be Converted
                    System.out.print("\n\n");

                    while(exit2 == true){
                        System.out.println("Select The Number System To Convert The Number To");
                        System.out.println("1. Binary Number System"+"\n"+"2. Decimal Number System"+"\n"+"3. Hexadecimal Number System"+"\n");
                        System.out.println("\nEnter 0 To Go Back To Main Menu");
                        int choiceOct = Integer.parseInt(br.readLine());// Accepting INTEGER using BufferedReader
                        System.out.println();

                        switch(choiceOct){

                            case 0:
                                exit2 = false;

                                break;

                            case 1:
                                //Octal To Binary

                                //First Converting Octal To Decimal
                                //variable delcarations
                                long baseOctToBin_OctToDec = 1;
                                long remOctToBin_OctToDec = 0;
                                long copyOctToBin_OctToDec = num;
                                long sumOctToBin_OctToDec = 0;
                                long new_numOctToBin_OctToDec = 0;

                                for(int i = 1; copyOctToBin_OctToDec > 0; i++){

                                    remOctToBin_OctToDec = copyOctToBin_OctToDec % 10;
                                    copyOctToBin_OctToDec = copyOctToBin_OctToDec / 10;
                                    new_numOctToBin_OctToDec = remOctToBin_OctToDec * baseOctToBin_OctToDec;
                                    baseOctToBin_OctToDec = baseOctToBin_OctToDec * 8;
                                    sumOctToBin_OctToDec = sumOctToBin_OctToDec + new_numOctToBin_OctToDec;

                                }
                                //Converting Decimal To Binary
                                long copyOctToBin_DecToBin = sumOctToBin_OctToDec;
                                long remOctToBin_DecToBin = 0;
                                long new_numOctToBin_DecToBin = 0;
                                long revOctToBin_DecToBin = 1;

                                for(int i = 1; copyOctToBin_DecToBin > 0; i++){

                                    remOctToBin_DecToBin = copyOctToBin_DecToBin % 2;
                                    copyOctToBin_DecToBin /= 2;
                                    new_numOctToBin_DecToBin = new_numOctToBin_DecToBin + remOctToBin_DecToBin * revOctToBin_DecToBin;
                                    revOctToBin_DecToBin *= 10;

                                }
                                System.out.println("Binary Number Is : "+new_numOctToBin_DecToBin);
                                System.out.println();

                                break;

                            case 2 :
                                //Octal To Decimal

                                //variable delcarations
                                long baseOctToDec = 1;
                                long remOctToDec = 0;
                                long copyOctToDec = num;
                                long sumOctToDec = 0;
                                long new_numOctToDec = 0;

                                for(int i = 1; copyOctToDec > 0; i++){

                                    remOctToDec = copyOctToDec % 10;
                                    copyOctToDec = copyOctToDec / 10;
                                    new_numOctToDec = remOctToDec * baseOctToDec;
                                    baseOctToDec = baseOctToDec * 8;
                                    sumOctToDec = sumOctToDec + new_numOctToDec;

                                }
                                System.out.println("Decimal Number Is : "+sumOctToDec);
                                System.out.println();

                                break;

                            case 3:
                                //Octal To Hexadecimal

                                //First Octal To Decimal

                                //variable delcarations
                                long baseOctToHex_OctToDec = 1;
                                long remOctToHex_OctToDec = 0;
                                long copyOctToHex_OctToDec = num;
                                long sumOctToHex_OctToDec = 0;
                                long new_numOctToHex_OctToDec = 0;

                                for(int i = 1; copyOctToHex_OctToDec > 0; i++){

                                    remOctToHex_OctToDec = copyOctToHex_OctToDec % 10;
                                    copyOctToHex_OctToDec = copyOctToHex_OctToDec / 10;
                                    new_numOctToHex_OctToDec = remOctToHex_OctToDec * baseOctToHex_OctToDec;
                                    baseOctToHex_OctToDec = baseOctToHex_OctToDec * 8;
                                    sumOctToHex_OctToDec = sumOctToHex_OctToDec + new_numOctToHex_OctToDec;

                                }

                                //Second Decimal To Hexadecimal

                                //Variable declarations
                                long remOctToHex_DecToHex = 0;
                                long copyOctToHex_DecToHex = sumOctToHex_OctToDec;
                                int countOctToHex_DecToHex = 0;
                                long remCountOctToHex_DecToHex = 0;

                                for(int i = 0; copyOctToHex_DecToHex> 0; i++){

                                    remCountOctToHex_DecToHex = copyOctToHex_DecToHex % 16;
                                    copyOctToHex_DecToHex /= 16;
                                    countOctToHex_DecToHex++;

                                }

                                //Array declarations
                                long remArrOctToHex_DecToHex[] = new long[countOctToHex_DecToHex];
                                String strOctToHex_DecToHex = "";

                                copyOctToHex_DecToHex = sumOctToHex_OctToDec;
                                for(int i = 0; copyOctToHex_DecToHex > 0; i++){

                                    remOctToHex_DecToHex = copyOctToHex_DecToHex % 16;
                                    copyOctToHex_DecToHex /= 16;
                                    remArrOctToHex_DecToHex[i] = remOctToHex_DecToHex;

                                }

                                for(int i = (remArrOctToHex_DecToHex.length - 1); i >= 0; i--){

                                    if(remArrOctToHex_DecToHex[i] <= 9)
                                        strOctToHex_DecToHex = strOctToHex_DecToHex + remArrOctToHex_DecToHex[i];
                                    else{

                                        if(remArrOctToHex_DecToHex[i] == 10)
                                            strOctToHex_DecToHex = strOctToHex_DecToHex + (char)(remArrOctToHex_DecToHex[i] + 55);
                                        else if(remArrOctToHex_DecToHex[i] == 11)
                                            strOctToHex_DecToHex = strOctToHex_DecToHex + (char)(remArrOctToHex_DecToHex[i] + 55);
                                        else if(remArrOctToHex_DecToHex[i] == 12)
                                            strOctToHex_DecToHex = strOctToHex_DecToHex + (char)(remArrOctToHex_DecToHex[i] + 55);
                                        else if(remArrOctToHex_DecToHex[i] == 13)
                                            strOctToHex_DecToHex = strOctToHex_DecToHex + (char)(remArrOctToHex_DecToHex[i] + 55);
                                        else if(remArrOctToHex_DecToHex[i] == 14)
                                            strOctToHex_DecToHex = strOctToHex_DecToHex + (char)(remArrOctToHex_DecToHex[i] + 55);
                                        else if(remArrOctToHex_DecToHex[i] == 15)
                                            strOctToHex_DecToHex = strOctToHex_DecToHex + (char)(remArrOctToHex_DecToHex[i] + 55);
                                        else
                                            System.out.println("Error");


                                    }

                                }
                                System.out.println("Hexadecimal Number Is : "+ strOctToHex_DecToHex);
                                System.out.println();

                                break;

                            default :
                                System.out.println("Invalid Entry!!");

                                break;


                        }//end of Inner switch case

                    }
                    System.out.println("======*======*======*======*======*======*======*======*=======*======*======*======*=======*======");
                    System.out.print("\n\n");

                    break;

                case 3:
                    //if choice is Decimal
                    System.out.println("Enter The Number From The Selected Number System : ");
                    num = Integer.parseInt(br.readLine()); //Number To Be Converted
                    System.out.print("\n\n");

                    while(exit3 == true){
                        System.out.println("Select The Number System To Convert The Number To");
                        System.out.println("1. Binary Number System"+"\n"+"2. Octal Number System"+"\n"+"3. Hexadecimal Number System"+"\n");
                        System.out.println("\nEnter 0 To Go Back To Main Menu");
                        int choiceDec = Integer.parseInt(br.readLine());// Accepting INTEGER using BufferedReader
                        System.out.println();

                        switch(choiceDec){

                            case 0:
                                exit3 = false;

                                break;

                            case 1:
                                //Decimal To Binary

                                //variable declarations
                                long remDecToBin = 0;
                                long copyDecToBin = num;
                                long revDecToBin = 1;
                                long new_numDecToBin = 0;

                                for(int i = 1; copyDecToBin > 0; i++){

                                    remDecToBin = copyDecToBin % 2;
                                    copyDecToBin /= 2;
                                    new_numDecToBin = new_numDecToBin + remDecToBin * revDecToBin;
                                    revDecToBin *= 10;

                                }
                                System.out.println("Binary Number Is : "+new_numDecToBin);
                                System.out.println();

                                break;

                            case 2:
                                //Decimal To Octal

                                //variable declarations
                                long remDecToOct = 0;
                                long copyDecToOct = num;
                                long revDecToOct = 1;
                                long new_numDecToOct = 0;

                                for(int i = 1; copyDecToOct > 0; i++){

                                    remDecToOct = copyDecToOct % 8;
                                    copyDecToOct /= 8;
                                    new_numDecToOct = new_numDecToOct + remDecToOct * revDecToOct;
                                    revDecToOct *= 10;

                                }
                                System.out.println("Octal Number Is : "+new_numDecToOct);
                                System.out.println();

                                break;

                            case 3 :
                                //Decimal To Hexadecimal

                                //Variable declarations
                                long remDecToHex = 0;
                                long copyDecToHex = num;
                                int countDecToHex = 0;
                                long remCountDecToHex = 0;

                                for(int i = 0; copyDecToHex > 0; i++){

                                    remCountDecToHex = copyDecToHex % 16;
                                    copyDecToHex /= 16;
                                    countDecToHex++;

                                }

                                //Array declarations
                                long remArrDecToHex[] = new long[countDecToHex];
                                String strDecToHex = "";

                                copyDecToHex = num;
                                for(int i = 0; copyDecToHex > 0; i++){

                                    remDecToHex = copyDecToHex % 16;
                                    copyDecToHex /= 16;
                                    remArrDecToHex[i] = remDecToHex;

                                }

                                for(int i = (remArrDecToHex.length - 1); i >= 0; i--){

                                    if(remArrDecToHex[i] <= 9)
                                        strDecToHex = strDecToHex + remArrDecToHex[i];
                                    else{

                                        if(remArrDecToHex[i] == 10)
                                            strDecToHex = strDecToHex + (char)(remArrDecToHex[i] + 55);
                                        else if(remArrDecToHex[i] == 11)
                                            strDecToHex = strDecToHex + (char)(remArrDecToHex[i] + 55);
                                        else if(remArrDecToHex[i] == 12)
                                            strDecToHex = strDecToHex + (char)(remArrDecToHex[i] + 55);
                                        else if(remArrDecToHex[i] == 13)
                                            strDecToHex = strDecToHex + (char)(remArrDecToHex[i] + 55);
                                        else if(remArrDecToHex[i] == 14)
                                            strDecToHex = strDecToHex + (char)(remArrDecToHex[i] + 55);
                                        else if(remArrDecToHex[i] == 15)
                                            strDecToHex = strDecToHex + (char)(remArrDecToHex[i] + 55);
                                        else
                                            System.out.println("Error");

                                    }

                                }
                                System.out.println("Hexadecimal Number Is : "+ strDecToHex);
                                System.out.println();

                                break;

                            default :
                                System.out.println("Invalid Entry!!");

                                break;

                        }//end of Inner Switch case

                    }
                    System.out.println("======*======*======*======*======*======*======*======*=======*======*======*======*=======*======");
                    System.out.print("\n\n");

                    break;

                case 4:
                    //If Choice is Hexadecimal
                    System.out.println("Enter The Number From The Selected Number System : ");
                    String hexDecimal_num = br.readLine(); // Accepting a Hexadeciamal Number
                    System.out.print("\n\n");

                    while(exit4 == true){
                        System.out.println("Select The Number System To Convert The Number To");
                        System.out.println("1. Binary Number System"+"\n"+"2. Octal Number System"+"\n"+"3. Decimal Number System"+"\n");
                        System.out.println("\nEnter 0 To Go Back To Main Menu");
                        int choiceHex = Integer.parseInt(br.readLine());// Accepting INTEGER using BufferedReader
                        System.out.println();

                        switch(choiceHex){


                            case 0:
                                exit4 = false;

                                break;

                            case 1 :
                                //Hexadeciaml To Binary

                                String copyHexToBin_HexToDec = hexDecimal_num;
                                long decimal_numHexToBin_HexToDec = 0; // For Storing decimal number

                                //String To Character Array
                                char hexCharHexToBin_HexToDec[] = copyHexToBin_HexToDec.toCharArray();

                                //For storing the value of the alphanumeric digits of the hexadeciaml number
                                int hexValueHexToBin_HexToDec[] = new int[hexCharHexToBin_HexToDec.length];

                                for(int i = 0; i < hexCharHexToBin_HexToDec.length; i++){

                                    if(hexCharHexToBin_HexToDec[i] >= '0' && hexCharHexToBin_HexToDec[i] <= '9')
                                        hexValueHexToBin_HexToDec[i] = hexCharHexToBin_HexToDec[i] - '0';
                                    else if(hexCharHexToBin_HexToDec[i] >= 'A' && hexCharHexToBin_HexToDec[i] <= 'F')
                                        hexValueHexToBin_HexToDec[i] = hexCharHexToBin_HexToDec[i] - 'A' + 10;
                                    else if(hexCharHexToBin_HexToDec[i] >= 'a' && hexCharHexToBin_HexToDec[i] <= 'f')
                                        hexValueHexToBin_HexToDec[i] = hexCharHexToBin_HexToDec[i] - 'a' + 10;
                                    else
                                        System.out.println("Invalid Character !!!");

                                }

                                long baseHexToBin_HexToDec = 1;
                                for(int i = hexCharHexToBin_HexToDec.length - 1; i >= 0; i--){

                                    decimal_numHexToBin_HexToDec = decimal_numHexToBin_HexToDec + hexValueHexToBin_HexToDec[i] * baseHexToBin_HexToDec;
                                    baseHexToBin_HexToDec = baseHexToBin_HexToDec * 16;

                                }

                                //Decimal To Binary

                                //variable declarations
                                long remHexToBin_DecToBin = 0;
                                long copyHexToBin_DecToBin = decimal_numHexToBin_HexToDec;
                                long revHexToBin_DecToBin = 1;
                                long new_numHexToBin_DecToBin = 0;

                                for(int i = 1; copyHexToBin_DecToBin > 0; i++){

                                    remHexToBin_DecToBin = copyHexToBin_DecToBin % 2;
                                    copyHexToBin_DecToBin /= 2;
                                    new_numHexToBin_DecToBin = new_numHexToBin_DecToBin + remHexToBin_DecToBin * revHexToBin_DecToBin;
                                    revHexToBin_DecToBin *= 10;

                                }
                                System.out.println("Binary Number Is : "+new_numHexToBin_DecToBin);
                                System.out.println();


                                break;

                            case 2:
                                //Hexadeciamal To Octal

                                //Hexadecimal To Decimal

                                String copyHexToOct_HexToDec = hexDecimal_num;
                                long decimal_numHexToOct_HexToDec = 0; // For Storing decimal number

                                //String To Character Array
                                char hexCharHexToOct_HexToDec[] = copyHexToOct_HexToDec.toCharArray();

                                //For storing the value of the alphanumeric digits of the hexadecimal number
                                int hexValueHexToOct_HexToDec[] = new int[hexCharHexToOct_HexToDec.length];

                                for(int i = 0; i < hexCharHexToOct_HexToDec.length; i++){

                                    if(hexCharHexToOct_HexToDec[i] >= '0' && hexCharHexToOct_HexToDec[i] <= '9')
                                        hexValueHexToOct_HexToDec[i] = hexCharHexToOct_HexToDec[i] - '0';
                                    else if(hexCharHexToOct_HexToDec[i] >= 'A' && hexCharHexToOct_HexToDec[i] <= 'F')
                                        hexValueHexToOct_HexToDec[i] = hexCharHexToOct_HexToDec[i] - 'A' + 10;
                                    else if(hexCharHexToOct_HexToDec[i] >= 'a' && hexCharHexToOct_HexToDec[i] <= 'f')
                                        hexValueHexToOct_HexToDec[i] = hexCharHexToOct_HexToDec[i] - 'a' + 10;
                                    else
                                        System.out.println("Invalid Character !!!");

                                }

                                long baseHexToOct_HexToDec = 1;
                                for(int i = hexCharHexToOct_HexToDec.length - 1; i >= 0; i--){

                                    decimal_numHexToOct_HexToDec = decimal_numHexToOct_HexToDec + hexValueHexToOct_HexToDec[i] * baseHexToOct_HexToDec;
                                    baseHexToOct_HexToDec = baseHexToOct_HexToDec * 16;

                                }

                                //Decimal To Octal

                                //variable declarations
                                long remHexToOct_DecToOct = 0;
                                long copyHexToOct_DecToOct = decimal_numHexToOct_HexToDec;
                                long revHexToOct_DecToOct = 1;
                                long new_numHexToOct_DecToOct = 0;

                                for(int i = 1; copyHexToOct_DecToOct > 0; i++){

                                    remHexToOct_DecToOct = copyHexToOct_DecToOct % 8;
                                    copyHexToOct_DecToOct /= 8;
                                    new_numHexToOct_DecToOct = new_numHexToOct_DecToOct + remHexToOct_DecToOct * revHexToOct_DecToOct;
                                    revHexToOct_DecToOct *= 10;

                                }
                                System.out.println("Octal Number Is : "+new_numHexToOct_DecToOct);
                                System.out.println();


                                break;

                            case 3:
                                //Hexadecimal To Decimal

                                String copyHexToDec = hexDecimal_num;
                                long decimal_numHexToDec = 0; // For Storing decimal number

                                //String To Character Array
                                char hexCharHexToDec[] = copyHexToDec.toCharArray();

                                //For storing the value of the alphanumeric digits of the hexadeciaml number
                                int hexValueHexToDec[] = new int[hexCharHexToDec.length];

                                for(int i = 0; i < hexCharHexToDec.length; i++){

                                    if(hexCharHexToDec[i] >= '0' && hexCharHexToDec[i] <= '9')
                                        hexValueHexToDec[i] = hexCharHexToDec[i] - '0';
                                    else if(hexCharHexToDec[i] >= 'A' && hexCharHexToDec[i] <= 'F')
                                        hexValueHexToDec[i] = hexCharHexToDec[i] - 'A' + 10;
                                    else if(hexCharHexToDec[i] >= 'a' && hexCharHexToDec[i] <= 'f')
                                        hexValueHexToDec[i] = hexCharHexToDec[i] - 'a' + 10;
                                    else
                                        System.out.println("Invalid Character !!!");

                                }

                                long baseHexToDec = 1;
                                for(int i = hexCharHexToDec.length - 1; i >= 0; i--){

                                    decimal_numHexToDec = decimal_numHexToDec + hexValueHexToDec[i] * baseHexToDec;
                                    baseHexToDec = baseHexToDec * 16;

                                }
                                System.out.println("Decimal Number Is : "+decimal_numHexToDec);
                                System.out.println();

                                break;

                            default :
                                System.out.println("Invalid Entry!!");

                                break;

                        }//end of inner switch case

                    }
                    System.out.println("======*======*======*======*======*======*======*======*=======*======*======*======*=======*======");
                    System.out.print("\n\n");

                    break;


                default :
                    System.out.println("Invalid Entry !!");

                    break;


            }// end of switch case

        }while(exit == true); //Infinite Loop
        System.out.println("Thank You For Visiting!!"+"\n"+"Successfully Calculating The Values.");


    }//end of main

}//end of class

