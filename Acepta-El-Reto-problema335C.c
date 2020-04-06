int main() {
  unsigned long long n, i, h, aux;
  
  scanf("%llu", &n);
  if (n==0) return 0;
  for (i = 0; i < n; ++i) {
    scanf("%llu", &h);
    aux = h*(h+1)*(h+2);
    printf("%llu\n", aux/6);
  }
  
  return 0;
}
