% Author: Marco A. Rodriguez-Suarez
% Project Euler Problem ID: 1
 multsOf3 = 3:3:1000-1;
 multsOf5 = 5:5:1000-1;
 naturalNumSum = sum(multsOf3)+ sum(multsOf5)-sum(multsOf3(ismember(multsOf3,multsOf5)));
