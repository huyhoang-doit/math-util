/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.hdi.mathutil.core.test;

import com.hdi.mathutil.core.MathUtility;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author lvhho
 */
public class MathUtilityDDTTest {
    // Chuan bi data sau nay se dua vao ham assert cua framework
    // data nay se tu tu duoc trich vao trong ham assert()
    // no phai nam trong ham co style static, nam co dinh o 1 vung ram
    
    
    // Test case : 0! => 1, 1! => 1, 2! => 2, 3! = > 6
    // ta thay co cac bo data (0,1), (1,1), (2,2), (3,6)
    // ta de rieng ra mot cai mang 2 chieu
    public static Object[][] initData() {
        return new Object[][] 
        {
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 6},
            {4, 24},
            {5, 120},
            {6, 720},
        };
    }
    
    // Test case de so sanh ham co tra ve ki vong khong
    
    @ParameterizedTest
    @MethodSource("initData")
    public void testFactorialGivenRighArgReturnWell(int n , long expected) {
        assertEquals(expected, MathUtility.getFactorial(n));
    }
}
