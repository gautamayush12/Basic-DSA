//Pseudo Code to find if there exists a subarray with sum 0 in an array:
// arr is the input array
// n is the size of the array
//Total Subarrays sum for an array with size n is n*(n+1)/2
//Suppose (l,r) are the left and right index of subarray

//Since we know that, prefix[i] = arr[0]+arr[1]+arr[2]+...+arr[i-1]+arr[i]
//So, (if l>0) sum of subarray (l,r) = prefix[r] - prefix[l-1] and (if l==0) then it's prefix[r]
//Or we can say that prefix[r] = sum of subarray (l,r) + prefix[l-1] 
//So, if sum of subarray (l,r) = 0 then prefix[r] = prefix[l-1]
//So, if we find any two prefix sums which are equal then we can say that there exists a subarray with sum 0
//We check for identical prefix Sums in prefix array using HashSet as we need to check repetition of prefix sums
// So, Indices coming in b/w (l-1) and r will form the subarray with sum 0 in the original array.