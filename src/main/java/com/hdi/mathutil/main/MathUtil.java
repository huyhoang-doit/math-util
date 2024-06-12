/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.hdi.mathutil.main;

import com.hdi.mathutil.core.MathUtility;
import javax.swing.JOptionPane;

/**
 *
 * @author lvhho
 */
public class MathUtil {
    
    public static void SayHiFromLocal() {
        
    }

    public static void main(String[] args) {
        // CACH KIEM THU 2 - GIONG CACH 1
        // Test case #1: check if 0! return 1
        int n = 0;
        long expectedResult = 1;
        long actualResult = MathUtility.getFactorial(n);
        String msg = "0!= | Expected: " + expectedResult + " Actual: " + actualResult;
        JOptionPane.showMessageDialog(null, msg);
    }
//    public static void main(String[] args) {
//        // DAY LA NOI TEST HAM
//        // viet cac test case: bo data dau vao va gia tri ki vong
//        // lat hoi so sanh gia tri tra ve voi gia tri thuc te
//        
//        // #Test case 1: 0! hy vong 1
//        int n = 0;
//        long expectedValue = 1;
//        long actualValue = MathUtility.getFactorial(n);
//        
//        // SO sanh giua expect vaf actual coi co == nhau hay khong
//        System.out.println("0! | Expected:" + expectedValue +
//                                " Actual: " + actualValue);
//        // #Test case 2: 5! hy vong 120
//        n = 5;
//        expectedValue = 1;
//        actualValue = MathUtility.getFactorial(n);
//        
//        // SO sanh giua expect vaf actual coi co == nhau hay khong
//        System.out.println("5! | Expected:" + expectedValue +
//                                " Actual: " + actualValue);
//        // #Test case 3: -1! hy vong nem ra ngoai le, do am 1 khong tinh duoc
//        n = -1;
//        //expectedValue = Ham in ra ngoai le;
//        System.out.println("Check getF(-1) to see the exception");
//        actualValue = MathUtility.getFactorial(n);
//        // HY VONG THAY NGOAI LE XUAT HIEN
//        // SO sanh giua expect vaf actual coi co == nhau hay khong
//        System.out.println("-1! | Expected:" + expectedValue +
//                                " Actual: " + actualValue);
//        
//    }
}
