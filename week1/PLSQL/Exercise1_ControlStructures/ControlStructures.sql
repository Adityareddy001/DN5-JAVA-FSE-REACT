SET SERVEROUTPUT ON;

DECLARE
    v_empName VARCHAR2(30) := 'Aditya';
    v_salary NUMBER := 55000;
    v_bonus NUMBER := 0;
BEGIN
    IF v_salary >= 50000 THEN
        v_bonus := v_salary * 0.20;
    ELSIF v_salary >= 30000 THEN
        v_bonus := v_salary * 0.10;
    END IF;

    DBMS_OUTPUT.PUT_LINE('Employee : ' || v_empName);
    DBMS_OUTPUT.PUT_LINE('Salary   : ' || v_salary);

    IF v_bonus > 0 THEN
        DBMS_OUTPUT.PUT_LINE('Bonus    : ' || v_bonus);
    ELSE
        DBMS_OUTPUT.PUT_LINE('No Bonus Applicable');
    END IF;
END;
/