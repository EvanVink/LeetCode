// Last updated: 9/23/2026, 9:24:05 AM
/**
 * @param {...(null|boolean|number|string|Array|Object)} args
 * @return {number}
 */
var argumentsLength = function(...args) {
   return args.length;
};

/**
 * argumentsLength(1, 2, 3); // 3
 */