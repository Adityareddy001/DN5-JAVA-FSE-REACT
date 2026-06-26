SET SERVEROUTPUT ON;

CREATE OR REPLACE PROCEDURE CalculateBonus(
    p_empName IN VARCHAR2,
    p_salary IN NUMBER
)
IS
    v_bonus NUMBER;
BEGIN
    IF p_salary >= 50000 THEN
        v_bonus := p_salary * 0.20;
    ELSE
        v_bonus := p_salary * 0.10;
    END IF;

    DBMS_OUTPUT.PUT_LINE('Employee : ' || p_empName);
    DBMS_OUTPUT.PUT_LINE('Salary   : ' || p_salary);
    DBMS_OUTPUT.PUT_LINE('Bonus    : ' || v_bonus);
END;
/

BEGIN
    CalculateBonus('Aditya', 60000);
END;
/