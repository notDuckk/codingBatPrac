// --- sleepIn ---
public boolean sleepIn(boolean weekday, boolean vacation) {
    //setting a boolean to be able to be carried through the while loop to return at the end;
    boolean tf = false;
    //using while loop to make it go through each option before ending;
    while (true){
        //if weekday and vacation == false the sleepIn returns true;
        if (weekday == false && vacation == false){
            tf = true;

        }else if(weekday == true && vacation == true){
            //else if weekday and vacation == true the sleepIn returns true;
            tf = true;
        } else if(weekday == true){
            //if weekday == true the sleepIn returns false;
            tf = false;
        }else {
            tf = true;
        }
        return tf;
    }
}
// --- hasTeen ---
public boolean hasTeen(int a, int b, int c) {
    //setting boolean to be able to carry through the if statement
    boolean hasteen = false;
    if(a >= 13 && a <= 19 ||b >= 13 && b <= 19 || c >= 13 && c <= 19){
        // if a,b,c are in between the numbers 13 and 19 return hasTeen = true;
        hasteen = true;
    }
    return hasteen;
}
// --- diff21 ---
public int diff21(int n) {
    // in n greater than or equal to return teh difference of 21 and the number given.. n
    if (n <= 21) {
        return 21 - n;
    } else {
        // else return the value of n - 21 multiplied by 2
        return (n - 21) * 2;
    }
}
// --- sumDouble ---
public int sumDouble(int a, int b) {
    // setting a varible to return as i think it looks cleaner to just return a variable name x 2 and so on;
    int sum = a + b;
    if(a == b){
        return sum * 2;
    }
    return sum;
}
// --- nearHundred ---
public boolean nearHundred(int n) {
    // setting a boolean to be able to return something at the end;
    boolean yaynah = false;
    // if statement to check if its 10 above or below 100.
    if (n >= 90 && n <= 110){
        yaynah = true;
    } else if (n >= 190 && n <= 210){
        // else if statement to check if its 10 above or below 200
        yaynah = true;
    } else {
        // return false if anything else
        yaynah = false;
    }
    //returning what the outcome is in the if statment
    return yaynah;
}
// --- parrotTrouble ---
public boolean parrotTrouble(boolean talking, int hour) {
    //setting a boolean to be able to retuurn a value;
    boolean tf = false;
    // if talking == true & hour is less and above 20 tf = true
    if(talking == true && (hour < 7||hour > 20)){
        tf = true;
    }else if(talking == false && (hour < 7||  hour > 20)) {
        // else if talking == false while in those specified times tf equals false
        tf = false;
    }else{
        //anything else tf = false
        tf = false;
    }
    //return result;
    return tf;
}
// --- makes10 ---
public boolean makes10(int a, int b) {
    //setting a boolean to be able to return a value
    boolean isNot = false;
    //if a+b = 10 isNot = true
    if (a+b == 10){
        isNot = true;
    }else if (10 == a || 10 == b){
        // if 10 == a or 10 == b return true
        isNot = true;
    }else{
        //everything else isNot = false
        isNot = false;
    }
    //return the isNot variable;
    return isNot;

}
// ---icyHot---
public boolean icyHot(int temp1, int temp2) {
    // setting a boolean to be able to return a value;
    boolean yea = false;
    //if one of the numbers is either or return true
    if (temp1 < 0 && temp2 > 100 || temp1 > 100 && temp2 < 0){
        yea = true;
    }
    return yea;
}
// ---in1020---
public boolean in1020(int a, int b) {
    //setting a variable to be able to return a value through the if statement;
    boolean yea = false;
    // if a is in the range 10 through 20 yea = true
    if (a >= 10 && a <= 20){
        yea = true;
    }else if (b >= 10 && b<=20){
        // if b is in the range 10 through 20 yea = true
        yea=true;
    }

    return yea;
}
// ---1oneTeen---
public boolean loneTeen(int a, int b) {
    boolean yea = false;
    // if a AND b are in the range return false;
    if (a >= 13 && a <=19 && b >=13 && b <=19){
        yea = false;
    }else if(a >= 13 && a <=19 || b >=13 && b <=19){
        //else if a OR b are in the range return true
        yea = true;
    }else {
        //everything else return false;
        yea = false;
    }
    return yea;
}
// ---monkeyTrouble---
public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
    boolean trub = false;
    // if a AND b smile are true return true;
    if (aSmile == true && bSmile == true){
        trub = true;
    }else if(aSmile == false && bSmile == false){
        // else if a AND b are false return true;
        trub = true;
    }
    return trub;
}
// --- or35 ---
public boolean or35(int n) {
    boolean yea = false;
    // if n divided by 3 or 5 == 0 yea = true
    if (n % 3 == 0 || n % 5 == 0){
        yea =true;
    }else {
        // anything else retrun false
        yea = false;
    }
    //return value cauight in if statement;
    return yea;
}

