//Pseudo Code to find sum of specific subarray for give index range(l,r) using Prefix Sum Array:
// l is left index of subarray and r is right index of subarray
// arr is the input array
// n is the size of the array
// prefix is the prefix sum array of size n

//Calculate Prefix Sum Array:
//prefix[n] = new int[n];
//prefix[0] = arr[0];
//for i=1 to n;
//prefix[i] = prefix[i-1] + arr[i] because
//prefixSum = arr[0]+arr[1]+arr[2]+...+arr[i-1]+arr[i]
//Or to optimize space we can modify the original array to store prefix sum
//arr[0] = arr[0];
//for i=1 to n;
//arr[i] = arr[i-1] + arr[i] because
//prefixSum = arr[0]+arr[1]+arr[2]+...+arr[i-1]+arr[i]

//To find sum of subarray from index l to r:
//if l==0 then return prefix[r]
//else return sum = prefix[r] - prefix[l-1] because prefix[l-1] is sum of elements before l and prefix[r] 
//is sum of elements from 0 to r