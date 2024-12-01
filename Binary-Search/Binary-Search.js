class Solution {
  /**
   * @param {number[]} nums
   * @param {number} target
   * @return {number}
   */

  search(nums, target) {
    let leftIndex = 0
    let rightIndex = nums.length - 1

    while (leftIndex <= rightIndex) {
      let mid = Math.floor((leftIndex + rightIndex) / 2)

      if (target < nums[mid]) {
        rightIndex = mid - 1
      } else if (target > nums[mid]) {
        leftIndex = mid + 1
      } else {
        return mid
      }
    }
    return -1
  }
}
