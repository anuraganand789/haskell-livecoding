fizzbuzz :: Int -> String
fizzbuzz inputNumber = 
  if divisibleByThree && divisibleByFive then "FizzBuzz"
  else if divisibleByThree then "Fizz"
  else if divisibleByFive then "Buzz"
  else show inputNumber
  where 
    divisibleByThree = mod inputNumber 3 == 0
    divisibleByFive  = mod inputNumber 5 == 0

main = mapM_ putStrLn (map fizzbuzz [1..100])
