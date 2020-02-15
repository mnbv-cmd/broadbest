package com.example.admin.broadcastbesttest;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


/**
 * A simple {@link Fragment} subclass.
 */
public class TitleFragment extends Fragment {
  private   Boolean isTwopage;

    public TitleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_title, container, false);
        RecyclerView recyclerView=(RecyclerView)view.findViewById(R.id.recyclerview);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getActivity());
       NewstitleApter apter=new NewstitleApter(getNews());
        recyclerView.setAdapter(apter);
        recyclerView.setLayoutManager(linearLayoutManager);
        return view;
    }
public List<news> getNews()
{
    List<news>list= new ArrayList<>();

        news news11=new news();
        news11.setTitle("第一封情书");
        news11.setContent("等你 在雨中 在造虹的雨中\n" +
                "蝉声沉落 蛙声升起\n" +
                "一池的红莲如红焰 在雨中\n" +
                "\n" +
                "你来不来都一样 竟感觉\n" +
                "每朵莲都像你\n" +
                "尤其隔著黄昏 隔著这样的细雨\n" +
                "\n" +
                "永恒 刹那 刹那 永恒\n" +
                "等你 在时间之外\n" +
                "在时间之内 等你 在刹那 在永恒\n" +
                "\n" +
                "如果你的手在我的手 此刻\n" +
                "如果你的清芬\n" +
                "在我的鼻孔 我会说 小情人\n" +
                "\n" +
                "诺 这只手应该采莲 在吴宫\n" +
                "这只手应该\n" +
                "摇一柄桂浆 在木兰舟中\n" +
                "\n" +
                "一颗星悬在科学馆的飞檐\n" +
                "耳坠子一般的悬著\n" +
                "瑞士表说都七点了 忽然你走来\n" +
                "\n" +
                "步雨後的红莲 翩翩 你走来\n" +
                "像一首小令\n" +
                "从一则爱情的典故你走来");
    news11.setImag(R.drawable.img1);
        list.add(news11);
    news news22=new news();
   news22.setTitle("第二封情书--你的宝贝写的哟");
    news22.setContent("余生的行动就是我的情诗，做我的小宝贝，我会一辈子呵护你，爱你，宠你" +
            "---情诗虽短，情谊很深哟");
    news22.setImag(R.drawable.img2);
    list.add(news22);
    news news33=new news();
    news33.setTitle("第三封情书");
    news33.setContent("If I were to fall in love,It would have to be with youYour eyes, your smile,The way you laugh,The things you say and do\n" +
            "Take me to the places,My heart never knew\n" +
            "So, if I were to fall in love,It would have to be with you.\n");
    news33.setImag(R.drawable.img3);
    list.add(news33);
    news news44=new news();
    news44.setImag(R.drawable.img4);
    news44.setContent("关关雎鸠，在河之洲。\n" +
            "窈窕淑女，君子好逑。\n" +
            "参差荇菜，左右流之。\n" +
            "窈窕淑女，寤寐求之。\n" +
            "求之不得，寤寐思服。\n" +
            "悠哉悠哉，辗转反侧。\n" +
            "参差荇菜，左右采之。\n" +
            "窈窕淑女，琴瑟友之。\n" +
            "参差荇菜，左右芼之。\n" +
            "窈窕淑女，钟鼓乐之。----我只钟爱小石");
    news44.setTitle("第四封情书");
    list.add(news44);
    news news55=new news();
    news55.setTitle("第五封了哟");
    news55.setContent("美丽的梦和美丽的诗一样\n" +
            "\n" +
            "都是可遇而不可求的\n" +
            "\n" +
            "常常在最没能料到的时刻里出现\n" +
            "\n" +
            "我喜欢那样的梦\n" +
            "\n" +
            "在梦里 一切都可以重新开始\n" +
            "\n" +
            "一切都可以慢慢解释\n" +
            "\n" +
            "心里甚至还能感觉到所有被浪费的时光\n" +
            "\n" +
            "竟然都能重回时的狂喜和感激\n" +
            "\n" +
            "胸怀中满溢著幸福\n" +
            "\n" +
            "只因为你就在我眼前\n" +
            "\n" +
            "对我微笑 一如当年\n" +
            "\n" +
            "我真喜欢那样的梦\n" +
            "\n" +
            "明明知道你已为我跋涉千里");
    news55.setImag(R.drawable.img5);
    list.add(news55);
    news news66=new news();
    news66.setTitle("第六封情书");
    news66.setContent("第一次见你是在摄影课，那时的你的样子--永远记得\n"+"在冬天抱在一起，在寒风风中亲吻--我喜欢\n"+
            "以后，夏天一起吃冰淇淋，---我喜欢"+"现在好想见到你，抱紧你");
    news66.setImag(R.drawable.img6);
    list.add(news66);
    news news77=new news();
    news77.setTitle("第七封情书");
    news77.setContent("我打江南走过\n" +
            "那等在季节里的容颜如莲花的开落\n" +
            "东风不来，三月的柳絮不飞\n" +
            "你的①心如小小的寂寞的城\n" +
            "恰若青石的街道向晚\n" +
            "跫音②不响，三月的春帷不揭\n" +
            "你底心是小小的窗扉紧掩\n" +
            "我达达的马蹄是美丽的错误\n" +
            "我不是归人，是个过客……");
    news77.setImag(R.drawable.img7);
    list.add(news77);
    news news88=new news();
    news88.setTitle("第八封情书");
    news88.setContent("这可能不是一封情书，哈哈哈，是一篇论文（辩论赛）（上次和你争论宝贝脾气好不好问题）。论点是我家宝贝脾气到底大不大？\n"+
            "我方观点我家宝贝脾气好（嘻嘻嘻），理由如下：1，脾气大的表现是蛮横不讲理，而我家宝贝知书达理，遇到事情都为别人着想\n"+
            "2.脾气好的女生一般都爱笑（网上研究有根据的），宝贝甜蜜的笑容简直是上天给我的馈赠，温暖我，迷着我\n"+
    "脾气好的女生一般都善解人意，在外面给足男人面子，看看瞧瞧，宝贝说过家里你老大，外面会给足我面子，这都不叫脾气好吗\n"+
    "那为什么这么脾气好的宝贝怎么会说自己脾气不好呢？\n"+
            "我觉吧，那天没想通，今天算是想通了。对于男朋友面前，你是很在乎他的感受啦（嘿嘿很爱他），"
            +"遇到一些事情，一般女生都会发脾气，小宝贝照样发了，但是宝贝就会因为爱我，发了之后，会想到不该这样（其实应该发的，其他女生会坚定认为自己没错），"+
            "最后就会想到宝贝自己脾气大（殊不知自己是脾气是这么好）\n"+"宝贝，大宝贝说得对不对，（嘿嘿嘿）");
    news88.setImag(R.drawable.img8);
    list.add(news88);
    news news99=new news();
    news99.setTitle("第九封情书");
    news99.setContent("小宝贝，终于到最后一封了。不知道你读没有读够。最后一封里我想说说我的心里话。\n" +
            "这封情书是我昨天下午写的，当时写的时候可甜蜜与高兴啦。或许这更像是一封信。" +
            "一封对自己心爱的女孩写的信。"+"一封思念的信。(不知不觉我俩就有三十几天没见啦，快点开学吧，想见宝贝)\n"+"还记得我们热恋的两个月吗，好甜蜜哟" +
            "第一次见你时候我是真的心动啦，长发，笑容迷住了我\n"+"第一次去壹华岭，夜景美，可你却是最美的，和另外一对情侣给我俩拍照时，搂着你"
    +"那时我感到爱情洋溢\n"+"第一次跨年，疯狂而又喜剧，也许是爱情吧，你进了寝室之后又出来，而我送宝贝进去之后在等待\n"+"遇到你之后我遇到许多幸福的第一次"+
    "好了，余生很长，但我想我和你一起度过，遇到这么好小宝贝，我会一直在的\n"+"最后宝贝情人节快乐哟");
    news99.setImag(R.drawable.img9);
    list.add(news99);
    return list;
}
    private  String getRandomLengthContent(String content)
    {
        Random random=new Random();
        int length=random.nextInt(20)+1;
        StringBuilder builder=new StringBuilder();
        for (int i=0;i<length;i++)
        {
            builder.append(content);
        }
        return builder.toString();
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (getActivity().findViewById(R.id.news_content_layout)!=null)
        {
            isTwopage=true;
        }
        else
        {
            isTwopage=false;
        }
    }

    class NewstitleApter extends RecyclerView.Adapter<NewstitleApter.Viewholder> {
private  List<news>newslist1;
        class Viewholder extends RecyclerView.ViewHolder {
            TextView newstitle ;
            ImageView newimage;
            public Viewholder(View view)
            {
                super(view);
                newstitle=(TextView) view.findViewById(R.id.news_title22);
               newimage=(ImageView)view.findViewById(R.id.image);
            }
        }
        public NewstitleApter(List<news>newsList)
        {
             newslist1=newsList;
        }

        @Override
        public Viewholder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.newstitleitem,parent,false);
           final Viewholder holder=new Viewholder(view);
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    news news1=newslist1.get(holder.getAdapterPosition());
                    if(isTwopage)
                    {
                        NewscontentFragment newscontentFragment=(NewscontentFragment)getFragmentManager().findFragmentById(R.id.news_content_frament);
                        newscontentFragment.refresh(news1.gettile(),news1.getcontent());
                    }
                    else {
                        newscontent.actionStart(getActivity(),news1.gettile(),news1.getcontent());
                    }
                }
            });
            return holder ;
        }

        @Override
        public void onBindViewHolder(Viewholder holder, int position) {
         news news=newslist1.get(position);
            holder.newstitle.setText(news.gettile());
            holder.newimage.setImageResource(news.getImag());

        }

        @Override
        public int getItemCount() {
            return newslist1.size();
        }
    }
}