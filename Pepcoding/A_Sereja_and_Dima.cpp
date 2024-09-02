#include<bits/stdc++.h>
using namespace std;
/*
 *    coder :: Saurabh Maurya
 *        >>> INDIA <<<
 */
#define sz(x) (int)(x).size()
#define ll long long
#define ff first
#define ss second
#define minheap priority_queue<long long, vector<long long>, greater<long long>>
#define endl "\n"
#define all(x) (x).begin() , (x).end()
#define fast                      \
    ios_base::sync_with_stdio(0); \
    cin.tie(0);                   \
    cout.tie(0);
#define pb push_back
#define PI 3.14159265358979323846
#define mod 1000000007
#define maxelement(nums) *max_element(nums.begin(), nums.end());
#define minelement(nums) *min_element(nums.begin(), nums.end());
#define debug(x) cout << #x << " " << x << endl;
#define setbits(x) __builtin_popcountll(x)
#define zerobits(x) __builtin_ctzll(x)
#define lb lower_bound
#define ub upper_bound
#define lcm(a, b) ((a) * (b)) / __gcd(a, b)
//using namespace __gnu_pbds;
//template<class T> using ordered_set = tree<T, null_type, less<T>, rb_tree_tag, tree_order_statistics_node_update> ;
//template<class key, class value, class cmp = std::less<key>> using ordered_map = tree<key, value, cmp, rb_tree_tag, tree_order_statistics_node_update>;
//find_by_order(k)  returns iterator to kth element starting from 0;
//order_of_key(k)   returns count of elements strictly smaller than k;

// Debug
#define d1(x)                cout<<#x<<": "<<x<<endl
#define d2(x, y)             cout<<#x<<": "<<x<<" | "<<#y<<": "<<y<<endl
#define d3(x, y, z)          cout<<#x<<":" <<x<<" | "<<#y<<": "<<y<<" | "<<#z<<": "<<z<<endl
#define d4(a, b, c, d)       cout<<#a<<": "<<a<<" | "<<#b<<": "<<b<<" | "<<#c<<": "<<c<<" | "<<#d<<": "<<d<<endl
#define d5(a, b, c, d, e)    cout<<#a<<": "<<a<<" | "<<#b<<": "<<b<<" | "<<#c<<": "<<c<<" | "<<#d<<": "<<d<<" | "<<#e<< ": "<<e<<endl
#define d6(a, b, c, d, e, f) cout<<#a<<": "<<a<<" | "<<#b<<": "<<b<<" | "<<#c<<": "<<c<<" | "<<#d<<": "<<d<<" | "<<#e<< ": "<<e<<" | "<<#f<<": "<<f<<endl
 
 
// movement in grid -> 2 d
const int x8[8] = {1, 0, -1, 0, 1, 1, -1, -1};
const int y8[8] = {0, 1, 0, -1, -1, 1, -1, 1};
const int x4[4] = {1, -1, 0, 0};
const int y4[4] = {0, 0, -1, 1};

template <class T>
vector<T> readvector(T n)
{
    vector<T> arr(n);
    for (int i = 0; i < n; i++)
        cin >> arr[i];
    return arr;
}
template <class T>
void debugst(set<T> &st)
{
    for(auto x : st)
    {
        cout<< x << " ";
    }
    cout<< endl;
}
template <class T>
void debugv(vector<T> &arr)
{
    for(auto x : arr)
    {
        cout<< x << " ";
    }
    cout<< endl;
}

// always think for n == 1 , n == 0 
// in 1 sec we can do 10^7
// if choices given think for dp or memorization 
// read the question again , question is giving us the clue ;
// if you have to find number of ways then think for pnc and dp .
// in ways type of question start dry run from n : 0 ,1, 2 ... n and find
// the rec relation 

void solve()
{
    ll n ;
    cin >> n ;
    vector<ll> arr = readvector(n) ;

    sort(all(arr));
    debugv(arr);
    int i = 0 , sum = 0;
    while(i < n){
        // d1(arr[i]);
        sum += arr[i];
        i += 2;
    }

    int j = 1 , sum2 = 0;
    while(j < n){
        // d1(arr[j]);
        sum2 += arr[j];
        j += 2;
    }
    cout << max(sum, sum2) << " " << min(sum , sum2) << endl;
    return ;
}
 
int main()
{
    fast;
    ll t;
    cin >> t;
    while(t--)
    {
        solve();
    }
}

