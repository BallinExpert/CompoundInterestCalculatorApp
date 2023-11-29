<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Compound Calculator</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            display: flex;
            align-items: center;
            justify-content: center;
            height: 100vh;
            background-color: #f5f5f5;
        }

        form {
            text-align: left;
            width: 350px;
            padding: 20px;
            border: 4px solid #4682b4;
            border-radius: 15px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            background-color: #ffffff;
        }

        h1 {
            text-align: center;
            margin-bottom: 20px;
        }

        label {
            display: block;
            margin-top: 10px;
            margin-bottom: 5px;
        }

        input {
            width: calc(100% - 20px);
            margin-top: 5px;
            padding: 8px;
            border: 2px solid #4682b4;
            border-radius: 5px;
            transition: border-color 0.3s;
            box-sizing: border-box;
        }

        input:focus {
            border-color: #4d90fe;
            outline: none;
        }

        button {
            width: 100%;
            margin-top: 20px;
            padding: 10px;
            background-color: #4682b4;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }

        p {
            text-align: center;
            color: red;
            margin: 10px 0;
        }

        p.result {
            text-align: center;
            margin-top: 20px;
            color: green;
        }
    </style>
</head>
<body>

<form action="home" method="post">
    <h1>Compound Interest Calculator</h1>

    <label for="principalAmount">Principal amount</label>
    <input type="number" id="principalAmount" name="principalAmount" value="${principalAmount}">

    <label for="interestRate">Interest Percentage%</label>
    <input type="number" id="interestRate" name="interestRate" min="1" max="100" value="${interestRate}">

    <label for="years">Number Of Years</label>
    <input type="number" id="years" name="years" min="1" value="${years}">

    <label for="CompoundingPeriod">Times Per Year (1 to 12)</label>
    <input type="number" id="CompoundingPeriod" name="CompoundingPeriod" min="1" max="12" value="${CompoundingPeriod}">

    <button type="submit">Calculate</button>

    <p>${error}</p>
    <p class="result">Result: ${result}</p>
</form>

</body>
</html>



