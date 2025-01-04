function bubbleSort(arr) {
    for (let i = 0; i < arr.length - 1; i++) {
      //for each traversal, the right sight of the array gets sorted
      for (let j = 0; j < arr.length - i - 1; j++) {
        if (arr[j] < arr[j - 1]) {
          //most common method in sorting: SWAP
          let temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
    return arr;
  }

const numbers = [64, 34, 25, 12, 22, 11, 90];
// const sortedNumbers = bubbleSort([64, 34, 25, 12, 22, 11, 90]);
const sortedNumbers = mergeSort([64, 34, 25, 12, 22, 11, 90]);
console.log("Unsorted Numbers:" + numbers);
console.log("Sorted Numbers:" +sortedNumbers); // Output: [11, 12, 22, 25, 34, 64, 90]