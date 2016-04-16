uint32_t reverseBits(uint32_t n) {
    int t=0;
    for(int i=0;i<32;i++) {
        t=t*2+n%2;
        n/=2;
    }
    return t;
}
