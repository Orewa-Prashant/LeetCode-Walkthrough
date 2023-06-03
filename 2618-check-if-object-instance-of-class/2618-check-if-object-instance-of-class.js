/**
 * @param {any} object
 * @param {any} classFunction
 * @return {boolean}
 */
// Function to check if an object is an instance of a given class
const checkIfInstanceOf = (obj, classFunction) => {
  // Check if the object is null, undefined, or if classFunction is not a function
  if (obj===null || obj===undefined || typeof classFunction !== 'function') {
    return false; // Return false if any of the conditions are true
  }

  let prototype = Object.getPrototypeOf(obj); // Get the prototype of the object

  while (prototype) {
    // Iterate through the prototype chain of the object
    if (prototype === classFunction.prototype) {
      // Check if the current prototype matches the prototype of the given class
      return true; // Return true if a match is found
    }
    prototype = Object.getPrototypeOf(prototype); // Move to the next prototype in the chain
  }
  return false; // Return false if no match is found in the entire prototype chain
};


/**
 * checkIfInstanceOf(new Date(), Date); // true
 */