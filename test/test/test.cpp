#include <list>;
#include <iostream>
using namespace std;


class youtubeChannel {
public:
    string Name;
    string OwnerName;
    int SubscribeChannelCount;
    list<string> PublishedVideoTitle;

};

int main()
{
    youtubeChannel ytchannel;
    ytchannel.Name = "Killer99";
    ytchannel.OwnerName = "sathira";
    ytchannel.SubscribeChannelCount = 1000;
    ytchannel.PublishedVideoTitle = { "impossible shot for a pubg game play in my descktop pc" };

    cout << "Name" << ytchannel.Name << endl;
    cout << "Owner Name" << ytchannel.OwnerName << endl;
    cout << "Subscribe Channel Count" << ytchannel.SubscribeChannelCount << endl;
    cout << "Videos" << endl;
    for (string videoTitle : ytchannel.PublishedVideoTitle) {
        cout << videoTitle << endl;
    }
    {

    }
}

