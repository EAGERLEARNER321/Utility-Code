nums=[1,2,3,4,4,4,7,7,1,3]
hash_map={}
n=len(nums)
for i in range(0,n):
    hash_map[nums[i]]=hash_map.get(nums[i],0)+1
print(hash_map)
