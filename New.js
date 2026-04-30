/**
 * @param {Function[]} functions
 * @return {Function}
 */
var compose = function(functions) {
    // Return a new function that takes the initial value x
    return function(x) {
        // use reduceRight to evaluate from right to left
        // 'acc' is the accumulated result, 'f' is the current function
        return functions.reduceRight((acc, f) => f(acc), x);
    };
};

/**
 * Example Usage:
 * const fn = compose([x => x + 1, x => x * x, x => 2 * x])
 * fn(4) // 65
 */
