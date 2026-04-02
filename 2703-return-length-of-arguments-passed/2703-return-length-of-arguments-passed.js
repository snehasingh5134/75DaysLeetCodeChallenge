/**
 * @param {...(null|boolean|number|string|Array|Object)} args
 * @return {number}
 */
var argumentsLength = function(...args) {
    return args.length;
};
// public int function(int[] arr){
//     int n = arr.length();
//     return n;
// }

/**
 * argumentsLength(1, 2, 3); // 3
 */