/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.hdi.mathutil.core.test;

import com.hdi.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lvhho
 */
public class MathUtilityTest {
    
    
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    // O day chua cac lenh cac ham de di test ham chinh o ben code chinh
    // O day ta lam cac ham ung voi cac test case de test code chinh o ben MathUtility,
    // vi du: .getFactorial()
    
    // TEST CASE: LÀ B? DATA ÐUA HÀM, APP Ð? VERIFY HÀM, APP CÓ X? LÝ
    // ÐÚNG HAY KHÔNG, NÓ ÐI KÈM THEO CÁCH XÀI HÀM, TRÌNH T? XÀI APP + EXPECTED
    // Tên hàm mang ý nghia c?a test case luôn
    // #TEST CASE 1: CHECK GETFACTORIAL() WITH N = 0, 0!
    // HOPE: RETURN 1
    @Test
    public void testFactorialGivenRightArg0ReturnWell() {
    int n = 0;
    long expectedValue = 1;
        long actuavalue;
        actuavalue = MathUtility.getFactorial(n);
        assertEquals(expectedValue, actuavalue);
        
        // cach cu la phai sout tung cai mot, dung mat de thay dung sai
    }
    
    // #TEST CASE 2: CHECK GETFACTORIAL() WITH N = 1, 1!
    // HOPE: RETURN 1
    @Test
    public void testFactorialGivenRightArg1ReturnWell() {
    int n = 1;
    long expectedValue = 1;
        long actuavalue;
        actuavalue = MathUtility.getFactorial(n);
        assertEquals(expectedValue, actuavalue);
        
        // cách cu là ph?i
    }
    
    // #TEST CASE 3: CHECK GETFACTORIAL() WITH N = 2,expected => 2! = 2
    //               CHECK GETFACTORIAL() WITH N = 3,expected => 3! = 6
    //               CHECK GETFACTORIAL() WITH N = 5,expected => 5! = 120
    // HOPE: RETURN 1
    @Test
    public void testFactorialGivenRightArg235ReturnWell() {
    int n = 2;
    long expectedValue = 2;
        long actuavalue;
        actuavalue = MathUtility.getFactorial(n);
        assertEquals(expectedValue, actuavalue);
        
        assertEquals(6, MathUtility.getFactorial(3));
        
        assertEquals(120, MathUtility.getFactorial(5));
    }
    
    // #TEST CASE 4: IF GET FACTORIAL RETURN EXCEPTION IF WE PASS N < 0
    // HOPE: RETURN 1
    @Test
    public void testFactorialGivenWrongArg_1ThrowException() {
    int n = -1;
    // Expected result: Illegal Argument Exception
    // Nho quy uoc: mau xanh ung voi nhu ki vong
    // Mau do: actua; != ki vong
    // Ngoai le Exeption khong la value, ta khong khai bao bien de = ngoai le duoc
    
        assertThrows(IllegalArgumentException.class, ()-> {MathUtility.getFactorial(n);});

    }
    
    // Phan kien thuc bo sung vao CV
    // TDD: TEST DRIVEN DEVELOPMENT
    // LA KI THUAT VIET CODE CUA DAN DEV DI KEM VOI VIET CAC TEST CASE 
    // TUC LA CODE MOI HAM, LUON DI KEM CODE KIEM THU
    // KET QUA KIEM THU HIEN THI THEO 2 MAU XANH - CODE NGON, PASS CAC TEST CASE
    // VIEC NAY CU LIEN TUC NHU VAY, VIEC VIET TEST CODE, VIEC VIET TEST CASE, RUN TEST
    // CASE DE XEM XANH DO, KI THUAT NAY GOI LA TDD
    
    // MOI NGON NGU LAP TRING DEU HO TRO CAC BO THU VIEN, FRAMEWORK GIUP TEST CODE 2 MAU XANH DO
    // GOI LA UNIT TESTING FRAMEWORK
    // MOI NGON NGU DEU HO TRO TDD, VAN DE LA DEV TEAM COS XAI HAY KHONG
    
    
    // DE BAI THUYET TRINH NHOM
    // NHOM HAY CHON 1 TESTING FRAMEWORK DE DEMO
    // VAO GOOGLE GO: TEST TING FRAMEWORK FOR NNLT, RA KQ THU VIEN
    
    // DONG THU 2 TRONG CV
    // DDT: DATA DRIVEN TESTING - PARAMETERIZED TESTING - VIET TEST CASE THEO STYLE THAM SO HOA
    //( DUNG NHAM VOI TDD - TEST DRIVEN DEVELOPMENT)
    // DDT LA PHAN MO RONG THEM KHI VIET CODE UNIT TEST, KI THUAT NANG CAO DE GIUP TO CHUC 
    // CAC TEST CASE, CO BA CON VOI TDD
    
    // DDT:  PARAMETERIZED TESTING LA KI THUAT VIET CAC TEST CASE MA TA TACH RIENG PHAN DATA RA KHOI CAC CAU LENH ASSERT()
    // CHO DE QUAN LY CAC TEST CASE, TINH THIEU DU CUA CAC TEST CASE
    // DE THEO DOI CAC PHAN CODE LIEN QUAN DEN TEST HAM
    // VI CAU LENHJ SO SANH EXPECTED VS ACTUAL TRO NEN GON NHE HON
}
    
    
        
