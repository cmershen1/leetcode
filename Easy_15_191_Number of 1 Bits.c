int hammingWeight(uint32_t n) {
    return (n==0||n==1)?n:(hammingWeight(n/2)+n%2);
}
