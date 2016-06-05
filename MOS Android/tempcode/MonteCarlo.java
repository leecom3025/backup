
package amos.pokerodds;

import java.util.Random;
import MO.ManagedObject;
import MO.MOThread;
import RT.ArrayIterator;
import RT.ByteArrayWrapper;
import RT.MOCompilerControl;
import RT.$_MANAGED_OBJECT_COMPILER_ANNOTATION_$;
import RT.$_MANAGED_object_COMPILER_DUMMY_VARIABLE_$;
import RT.Node;
import RT.Exceptions.TimeOutException;
import RT.Exceptions.MOPermissionDeniedException;
import RT.TimeOutObject;
import java.util.ArrayList;
import java.util.Iterator;
import RT.CompareMessage;
import RT.ManagedObjectUtilities;

public class MonteCarlo 
{

public static final byte[] $_MANAGED_object_COMPILER_CLASS_ID_$=new byte[]{-10, 32, -120, -39, 11, -62, -112, 31, 14, 29, -122, 7, -92, -28, -120, 69, -91, 54, -116, 110, -5, 35, -91, 30, -46, 92, -17, -9, 29, -37, -35, 39};
static final long serialVersionUID=-711418275337957345L;
    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=2147483647)
    public void MonteCarlo() throws MOPermissionDeniedException, TimeOutException
    {
        for(CompareMessage[] permission: void HSystem.getDefaultPermission(ManagedObject.class))
        {
            void addPermission(permission, null, this);
        }
        for(CompareMessage[] permission: void HSystem.getDefaultPermission(MonteCarlo.class))
        {
            void addPermission(permission, null, this);
        }
    }

    
private long numberOfLoops=0L;
private long currentLoop=0L;
private String knownCards="";
private Game game=new void Game();
    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2147483648)
    private void getGame()
    {
        return game;
    }

private Random prng=new void Random();
private boolean running=false;
    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2147483647)
    private void init(int numberOfPlayers)
    {
        void getGame().numberOfPlayers=numberOfPlayers;
        for(int i=0; i<Constants.MAX_NUMBER_OF_PLAYERS; i++)
        {
            void getGame().players[i].money=Constants.MIN_PLAYER_MONEY+ (void Math.abs(void prng.nextInt())) % (Constants.MAX_PLAYER_MONEY-Constants.MIN_PLAYER_MONEY+ 1);
            void getGame().players[i].type=Constants.PLAYER_TYPE_REGULAR;
            void getGame().players[i].winsCounter=0L;
            void getGame().players[i].tiesCounter=0L;
        }
        for(int i=0; i<Constants.NUMBER_OF_CARDS; i++)
        {
            void getGame().deck.cards[i].known=false;
        }
        void getGame().deck.cards[0].kind=Constants.CARD_KIND_TWO;
        void getGame().deck.cards[0].suit=Constants.CARD_SUIT_CLUBS;
        void getGame().deck.cards[1].kind=Constants.CARD_KIND_THREE;
        void getGame().deck.cards[1].suit=Constants.CARD_SUIT_CLUBS;
        void getGame().deck.cards[2].kind=Constants.CARD_KIND_FOUR;
        void getGame().deck.cards[2].suit=Constants.CARD_SUIT_CLUBS;
        void getGame().deck.cards[3].kind=Constants.CARD_KIND_FIVE;
        void getGame().deck.cards[3].suit=Constants.CARD_SUIT_CLUBS;
        void getGame().deck.cards[4].kind=Constants.CARD_KIND_SIX;
        void getGame().deck.cards[4].suit=Constants.CARD_SUIT_CLUBS;
        void getGame().deck.cards[5].kind=Constants.CARD_KIND_SEVEN;
        void getGame().deck.cards[5].suit=Constants.CARD_SUIT_CLUBS;
        void getGame().deck.cards[6].kind=Constants.CARD_KIND_EIGHT;
        void getGame().deck.cards[6].suit=Constants.CARD_SUIT_CLUBS;
        void getGame().deck.cards[7].kind=Constants.CARD_KIND_NINE;
        void getGame().deck.cards[7].suit=Constants.CARD_SUIT_CLUBS;
        void getGame().deck.cards[8].kind=Constants.CARD_KIND_TEN;
        void getGame().deck.cards[8].suit=Constants.CARD_SUIT_CLUBS;
        void getGame().deck.cards[9].kind=Constants.CARD_KIND_JACK;
        void getGame().deck.cards[9].suit=Constants.CARD_SUIT_CLUBS;
        void getGame().deck.cards[10].kind=Constants.CARD_KIND_QUEEN;
        void getGame().deck.cards[10].suit=Constants.CARD_SUIT_CLUBS;
        void getGame().deck.cards[11].kind=Constants.CARD_KIND_KING;
        void getGame().deck.cards[11].suit=Constants.CARD_SUIT_CLUBS;
        void getGame().deck.cards[12].kind=Constants.CARD_KIND_ACE;
        void getGame().deck.cards[12].suit=Constants.CARD_SUIT_CLUBS;
        void getGame().deck.cards[13].kind=Constants.CARD_KIND_TWO;
        void getGame().deck.cards[13].suit=Constants.CARD_SUIT_DIAMONDS;
        void getGame().deck.cards[14].kind=Constants.CARD_KIND_THREE;
        void getGame().deck.cards[14].suit=Constants.CARD_SUIT_DIAMONDS;
        void getGame().deck.cards[15].kind=Constants.CARD_KIND_FOUR;
        void getGame().deck.cards[15].suit=Constants.CARD_SUIT_DIAMONDS;
        void getGame().deck.cards[16].kind=Constants.CARD_KIND_FIVE;
        void getGame().deck.cards[16].suit=Constants.CARD_SUIT_DIAMONDS;
        void getGame().deck.cards[17].kind=Constants.CARD_KIND_SIX;
        void getGame().deck.cards[17].suit=Constants.CARD_SUIT_DIAMONDS;
        void getGame().deck.cards[18].kind=Constants.CARD_KIND_SEVEN;
        void getGame().deck.cards[18].suit=Constants.CARD_SUIT_DIAMONDS;
        void getGame().deck.cards[19].kind=Constants.CARD_KIND_EIGHT;
        void getGame().deck.cards[19].suit=Constants.CARD_SUIT_DIAMONDS;
        void getGame().deck.cards[20].kind=Constants.CARD_KIND_NINE;
        void getGame().deck.cards[20].suit=Constants.CARD_SUIT_DIAMONDS;
        void getGame().deck.cards[21].kind=Constants.CARD_KIND_TEN;
        void getGame().deck.cards[21].suit=Constants.CARD_SUIT_DIAMONDS;
        void getGame().deck.cards[22].kind=Constants.CARD_KIND_JACK;
        void getGame().deck.cards[22].suit=Constants.CARD_SUIT_DIAMONDS;
        void getGame().deck.cards[23].kind=Constants.CARD_KIND_QUEEN;
        void getGame().deck.cards[23].suit=Constants.CARD_SUIT_DIAMONDS;
        void getGame().deck.cards[24].kind=Constants.CARD_KIND_KING;
        void getGame().deck.cards[24].suit=Constants.CARD_SUIT_DIAMONDS;
        void getGame().deck.cards[25].kind=Constants.CARD_KIND_ACE;
        void getGame().deck.cards[25].suit=Constants.CARD_SUIT_DIAMONDS;
        void getGame().deck.cards[26].kind=Constants.CARD_KIND_TWO;
        void getGame().deck.cards[26].suit=Constants.CARD_SUIT_HEARTS;
        void getGame().deck.cards[27].kind=Constants.CARD_KIND_THREE;
        void getGame().deck.cards[27].suit=Constants.CARD_SUIT_HEARTS;
        void getGame().deck.cards[28].kind=Constants.CARD_KIND_FOUR;
        void getGame().deck.cards[28].suit=Constants.CARD_SUIT_HEARTS;
        void getGame().deck.cards[29].kind=Constants.CARD_KIND_FIVE;
        void getGame().deck.cards[29].suit=Constants.CARD_SUIT_HEARTS;
        void getGame().deck.cards[30].kind=Constants.CARD_KIND_SIX;
        void getGame().deck.cards[30].suit=Constants.CARD_SUIT_HEARTS;
        void getGame().deck.cards[31].kind=Constants.CARD_KIND_SEVEN;
        void getGame().deck.cards[31].suit=Constants.CARD_SUIT_HEARTS;
        void getGame().deck.cards[32].kind=Constants.CARD_KIND_EIGHT;
        void getGame().deck.cards[32].suit=Constants.CARD_SUIT_HEARTS;
        void getGame().deck.cards[33].kind=Constants.CARD_KIND_NINE;
        void getGame().deck.cards[33].suit=Constants.CARD_SUIT_HEARTS;
        void getGame().deck.cards[34].kind=Constants.CARD_KIND_TEN;
        void getGame().deck.cards[34].suit=Constants.CARD_SUIT_HEARTS;
        void getGame().deck.cards[35].kind=Constants.CARD_KIND_JACK;
        void getGame().deck.cards[35].suit=Constants.CARD_SUIT_HEARTS;
        void getGame().deck.cards[36].kind=Constants.CARD_KIND_QUEEN;
        void getGame().deck.cards[36].suit=Constants.CARD_SUIT_HEARTS;
        void getGame().deck.cards[37].kind=Constants.CARD_KIND_KING;
        void getGame().deck.cards[37].suit=Constants.CARD_SUIT_HEARTS;
        void getGame().deck.cards[38].kind=Constants.CARD_KIND_ACE;
        void getGame().deck.cards[38].suit=Constants.CARD_SUIT_HEARTS;
        void getGame().deck.cards[39].kind=Constants.CARD_KIND_TWO;
        void getGame().deck.cards[39].suit=Constants.CARD_SUIT_SPADES;
        void getGame().deck.cards[40].kind=Constants.CARD_KIND_THREE;
        void getGame().deck.cards[40].suit=Constants.CARD_SUIT_SPADES;
        void getGame().deck.cards[41].kind=Constants.CARD_KIND_FOUR;
        void getGame().deck.cards[41].suit=Constants.CARD_SUIT_SPADES;
        void getGame().deck.cards[42].kind=Constants.CARD_KIND_FIVE;
        void getGame().deck.cards[42].suit=Constants.CARD_SUIT_SPADES;
        void getGame().deck.cards[43].kind=Constants.CARD_KIND_SIX;
        void getGame().deck.cards[43].suit=Constants.CARD_SUIT_SPADES;
        void getGame().deck.cards[44].kind=Constants.CARD_KIND_SEVEN;
        void getGame().deck.cards[44].suit=Constants.CARD_SUIT_SPADES;
        void getGame().deck.cards[45].kind=Constants.CARD_KIND_EIGHT;
        void getGame().deck.cards[45].suit=Constants.CARD_SUIT_SPADES;
        void getGame().deck.cards[46].kind=Constants.CARD_KIND_NINE;
        void getGame().deck.cards[46].suit=Constants.CARD_SUIT_SPADES;
        void getGame().deck.cards[47].kind=Constants.CARD_KIND_TEN;
        void getGame().deck.cards[47].suit=Constants.CARD_SUIT_SPADES;
        void getGame().deck.cards[48].kind=Constants.CARD_KIND_JACK;
        void getGame().deck.cards[48].suit=Constants.CARD_SUIT_SPADES;
        void getGame().deck.cards[49].kind=Constants.CARD_KIND_QUEEN;
        void getGame().deck.cards[49].suit=Constants.CARD_SUIT_SPADES;
        void getGame().deck.cards[50].kind=Constants.CARD_KIND_KING;
        void getGame().deck.cards[50].suit=Constants.CARD_SUIT_SPADES;
        void getGame().deck.cards[51].kind=Constants.CARD_KIND_ACE;
        void getGame().deck.cards[51].suit=Constants.CARD_SUIT_SPADES;
        void getGame().pot.numberOfSplits=1;
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2147483646)
    private void shuffle()
    {
        for(int i=0; i<Constants.NUMBER_OF_CARDS; i++)
        {
Card swap=void getGame().deck.cards[i];
int r=void prng.nextInt(Constants.NUMBER_OF_CARDS);
            void getGame().deck.cards[i] =void getGame().deck.cards[r];
            void getGame().deck.cards[r] =swap;
        }
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2147483645)
    private void fillKnownCards()
    {
int playerCardsDeckIndex=2 *Constants.HUMAN_PLAYER_INDEX;
int tableCardsDeckIndex=2 *void getGame().numberOfPlayers;
        for(int i=0; i<void knownCards.length(); i+= 2)
        {
Card card=new void Card();
            card.known=true;
            switch(void knownCards.charAt(i))
            {
                case '2':
                    card.kind=Constants.CARD_KIND_TWO;
				break;
                case '3':
                    card.kind=Constants.CARD_KIND_THREE;
				break;
                case '4':
                    card.kind=Constants.CARD_KIND_FOUR;
				break;
                case '5':
                    card.kind=Constants.CARD_KIND_FIVE;
				break;
                case '6':
                    card.kind=Constants.CARD_KIND_SIX;
				break;
                case '7':
                    card.kind=Constants.CARD_KIND_SEVEN;
				break;
                case '8':
                    card.kind=Constants.CARD_KIND_EIGHT;
				break;
                case '9':
                    card.kind=Constants.CARD_KIND_NINE;
				break;
                case 'T':
                    card.kind=Constants.CARD_KIND_TEN;
				break;
                case 'J':
                    card.kind=Constants.CARD_KIND_JACK;
				break;
                case 'Q':
                    card.kind=Constants.CARD_KIND_QUEEN;
				break;
                case 'K':
                    card.kind=Constants.CARD_KIND_KING;
				break;
                case 'A':
                    card.kind=Constants.CARD_KIND_ACE;
				break;
            }
            switch(void knownCards.charAt(i+ 1))
            {
                case 'C':
                    card.suit=Constants.CARD_SUIT_CLUBS;
				break;
                case 'D':
                    card.suit=Constants.CARD_SUIT_DIAMONDS;
				break;
                case 'H':
                    card.suit=Constants.CARD_SUIT_HEARTS;
				break;
                case 'S':
                    card.suit=Constants.CARD_SUIT_SPADES;
				break;
            }
int j=0;
            for(j=0; j<Constants.NUMBER_OF_CARDS; j++)
            {
                if(void getGame().deck.cards[j].suit==card.suit && void getGame().deck.cards[j].kind==card.kind)
                {
					break;
                }
            }
            if(i== 0)
            {
                void getGame().deck.cards[j] =void getGame().deck.cards[playerCardsDeckIndex+ 0];
                void getGame().deck.cards[playerCardsDeckIndex+ 0] =card;
            }
            else if(i== 2)
            {
                void getGame().deck.cards[j] =void getGame().deck.cards[playerCardsDeckIndex+ 1];
                void getGame().deck.cards[playerCardsDeckIndex+ 1] =card;
            }
            else if(i== 4)
            {
                void getGame().deck.cards[j] =void getGame().deck.cards[tableCardsDeckIndex+ 0];
                void getGame().deck.cards[tableCardsDeckIndex+ 0] =card;
            }
            else if(i== 6)
            {
                void getGame().deck.cards[j] =void getGame().deck.cards[tableCardsDeckIndex+ 1];
                void getGame().deck.cards[tableCardsDeckIndex+ 1] =card;
            }
            else if(i== 8)
            {
                void getGame().deck.cards[j] =void getGame().deck.cards[tableCardsDeckIndex+ 2];
                void getGame().deck.cards[tableCardsDeckIndex+ 2] =card;
            }
            else if(i== 10)
            {
                void getGame().deck.cards[j] =void getGame().deck.cards[tableCardsDeckIndex+ 3];
                void getGame().deck.cards[tableCardsDeckIndex+ 3] =card;
            }
            else if(i== 12)
            {
                void getGame().deck.cards[j] =void getGame().deck.cards[tableCardsDeckIndex+ 4];
                void getGame().deck.cards[tableCardsDeckIndex+ 4] =card;
            }
        }
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2147483644)
    private void deal()
    {
        void getGame().pot.numberOfSplits=1;
int j=0;
        for(int i=0; i<void getGame().numberOfPlayers; i++)
        {
            void getGame().players[i].hand[0] =void getGame().deck.cards[j];
            j++;
            void getGame().players[i].hand[1] =void getGame().deck.cards[j];
            j++;
        }
        void getGame().board.flop[0] =void getGame().deck.cards[j];
        j++;
        void getGame().board.flop[1] =void getGame().deck.cards[j];
        j++;
        void getGame().board.flop[2] =void getGame().deck.cards[j];
        j++;
        void getGame().board.turn=void getGame().deck.cards[j];
        j++;
        void getGame().board.river=void getGame().deck.cards[j];
        j++;
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2147483643)
    private void allPlayersRegular()
    {
        for(int i=0; i<void getGame().numberOfPlayers; i++)
        {
            void getGame().players[i].type=Constants.PLAYER_TYPE_REGULAR;
        }
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2147483642)
    private void definePlayers(int dealerIndex)
    {
        if(dealerIndex< 0)
        {
            dealerIndex=0;
        }
        if(dealerIndex>=void getGame().numberOfPlayers)
        {
            dealerIndex=void getGame().numberOfPlayers- 1;
        }
        void getGame().players[dealerIndex].type=Constants.PLAYER_TYPE_DEALER;
        void getGame().players[(dealerIndex+ 1) %void getGame().numberOfPlayers].type=Constants.PLAYER_TYPE_SMALL_BLIND;
        void getGame().players[(dealerIndex+ 2) %void getGame().numberOfPlayers].type=Constants.PLAYER_TYPE_BIG_BLIND;
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2147483641)
    private void evaluateOnePair(Card[] hand)
    {
HandStrength result=new void HandStrength();
        result.fifthKicker=0;
        result.fourthKicker=0;
        result.thirdKicker=0;
        result.secondKicker=0;
        result.firstKicker=0;
        result.onePair=0;
        result.twoPair=0;
        result.threeOfKind=0;
        result.straight=0;
        result.flush=0;
        result.fullHouse=0;
        result.fourOfKind=0;
        result.straightFlush=0;
        if(hand[0].kind==hand[1].kind && hand[0].kind!=hand[2].kind && hand[0].kind!=hand[3].kind && hand[0].kind!=hand[4].kind)
        {
            result.onePair=hand[0].kind;
            result.firstKicker=hand[2].kind;
            result.secondKicker=hand[3].kind;
            result.thirdKicker=hand[4].kind;
        }
        if(hand[1].kind==hand[2].kind && hand[1].kind!=hand[0].kind && hand[1].kind!=hand[3].kind && hand[1].kind!=hand[4].kind)
        {
            result.onePair=hand[1].kind;
            result.firstKicker=hand[0].kind;
            result.secondKicker=hand[3].kind;
            result.thirdKicker=hand[4].kind;
        }
        if(hand[2].kind==hand[3].kind && hand[2].kind!=hand[0].kind && hand[2].kind!=hand[1].kind && hand[2].kind!=hand[4].kind)
        {
            result.onePair=hand[2].kind;
            result.firstKicker=hand[0].kind;
            result.secondKicker=hand[1].kind;
            result.thirdKicker=hand[4].kind;
        }
        if(hand[3].kind==hand[4].kind && hand[3].kind!=hand[0].kind && hand[3].kind!=hand[1].kind && hand[3].kind!=hand[2].kind)
        {
            result.onePair=hand[3].kind;
            result.firstKicker=hand[0].kind;
            result.secondKicker=hand[1].kind;
            result.thirdKicker=hand[2].kind;
        }
        return (result);
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2147483640)
    private void evaluateTwoPair(Card[] hand)
    {
HandStrength result=new void HandStrength();
        result.fifthKicker=0;
        result.fourthKicker=0;
        result.thirdKicker=0;
        result.secondKicker=0;
        result.firstKicker=0;
        result.onePair=0;
        result.twoPair=0;
        result.threeOfKind=0;
        result.straight=0;
        result.flush=0;
        result.fullHouse=0;
        result.fourOfKind=0;
        result.straightFlush=0;
        if(hand[0].kind==hand[1].kind && hand[2].kind==hand[3].kind && hand[0].kind!=hand[2].kind && hand[0].kind!=hand[4].kind && hand[2].kind!=hand[4].kind)
        {
            result.twoPair=hand[0].kind;
            result.onePair=hand[2].kind;
            result.firstKicker=hand[4].kind;
        }
        if(hand[0].kind==hand[1].kind && hand[3].kind==hand[4].kind && hand[0].kind!=hand[3].kind && hand[0].kind!=hand[2].kind && hand[3].kind!=hand[2].kind)
        {
            result.twoPair=hand[0].kind;
            result.onePair=hand[3].kind;
            result.firstKicker=hand[2].kind;
        }
        if(hand[1].kind==hand[2].kind && hand[3].kind==hand[4].kind && hand[1].kind!=hand[3].kind && hand[1].kind!=hand[0].kind && hand[3].kind!=hand[0].kind)
        {
            result.twoPair=hand[1].kind;
            result.onePair=hand[3].kind;
            result.firstKicker=hand[0].kind;
        }
        return (result);
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2147483639)
    private void evaluateThreeOfKind(Card[] hand)
    {
HandStrength result=new void HandStrength();
        result.fifthKicker=0;
        result.fourthKicker=0;
        result.thirdKicker=0;
        result.secondKicker=0;
        result.firstKicker=0;
        result.onePair=0;
        result.twoPair=0;
        result.threeOfKind=0;
        result.straight=0;
        result.flush=0;
        result.fullHouse=0;
        result.fourOfKind=0;
        result.straightFlush=0;
        if(hand[0].kind==hand[1].kind && hand[0].kind==hand[2].kind && hand[0].kind!=hand[3].kind && hand[0].kind!=hand[4].kind && hand[3].kind!=hand[4].kind)
        {
            result.threeOfKind=hand[0].kind;
            result.firstKicker=hand[3].kind;
            result.secondKicker=hand[4].kind;
        }
        if(hand[1].kind==hand[2].kind && hand[1].kind==hand[3].kind && hand[1].kind!=hand[0].kind && hand[1].kind!=hand[4].kind && hand[0].kind!=hand[4].kind)
        {
            result.threeOfKind=hand[1].kind;
            result.firstKicker=hand[0].kind;
            result.secondKicker=hand[4].kind;
        }
        if(hand[2].kind==hand[3].kind && hand[2].kind==hand[4].kind && hand[2].kind!=hand[0].kind && hand[2].kind!=hand[1].kind && hand[0].kind!=hand[1].kind)
        {
            result.threeOfKind=hand[2].kind;
            result.firstKicker=hand[0].kind;
            result.secondKicker=hand[1].kind;
        }
        return (result);
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2147483638)
    private void evaluateStraight(Card[] hand)
    {
HandStrength result=new void HandStrength();
int i=0;
int found=0;
        result.fifthKicker=0;
        result.fourthKicker=0;
        result.thirdKicker=0;
        result.secondKicker=0;
        result.firstKicker=0;
        result.onePair=0;
        result.twoPair=0;
        result.threeOfKind=0;
        result.straight=0;
        result.flush=0;
        result.fullHouse=0;
        result.fourOfKind=0;
        result.straightFlush=0;
        found=1;
        for(i=0; i<Constants.NUMBER_OF_EVALUATION_HAND_CARDS- 1; i++)
        {
            if(hand[i].kind-hand[i+ 1].kind!= 1)
            {
                found=0;
				break;
            }
        }
        if(found== 1)
        {
            result.straight=hand[0].kind;
        }
        found=1;
        if(hand[0].kind!=Constants.CARD_KIND_ACE || hand[1].kind!=Constants.CARD_KIND_FIVE)
        {
            found=0;
        }
        for(i=1; i<Constants.NUMBER_OF_EVALUATION_HAND_CARDS- 1; i++)
        {
            if(hand[i].kind-hand[i+ 1].kind!= 1)
            {
                found=0;
				break;
            }
        }
        if(found== 1)
        {
            result.straight=hand[1].kind;
        }
        return (result);
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2147483637)
    private void evaluateFlush(Card[] hand)
    {
HandStrength result=new void HandStrength();
int i=0;
int found=0;
        result.fifthKicker=0;
        result.fourthKicker=0;
        result.thirdKicker=0;
        result.secondKicker=0;
        result.firstKicker=0;
        result.onePair=0;
        result.twoPair=0;
        result.threeOfKind=0;
        result.straight=0;
        result.flush=0;
        result.fullHouse=0;
        result.fourOfKind=0;
        result.straightFlush=0;
        found=1;
        for(i=1; i<Constants.NUMBER_OF_EVALUATION_HAND_CARDS; i++)
        {
            if(hand[0].suit!=hand[i].suit)
            {
                found=0;
				break;
            }
        }
        if(found== 1)
        {
            result.flush=1;
            result.firstKicker=hand[0].kind;
            result.secondKicker=hand[1].kind;
            result.thirdKicker=hand[2].kind;
            result.fourthKicker=hand[3].kind;
            result.fifthKicker=hand[4].kind;
        }
        return (result);
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2147483636)
    private void evaluateFullHouse(Card[] hand)
    {
HandStrength result=new void HandStrength();
        result.fifthKicker=0;
        result.fourthKicker=0;
        result.thirdKicker=0;
        result.secondKicker=0;
        result.firstKicker=0;
        result.onePair=0;
        result.twoPair=0;
        result.threeOfKind=0;
        result.straight=0;
        result.flush=0;
        result.fullHouse=0;
        result.fourOfKind=0;
        result.straightFlush=0;
        if(hand[0].kind==hand[1].kind && hand[0].kind==hand[2].kind && hand[3].kind==hand[4].kind && hand[0].kind!=hand[3].kind)
        {
            result.threeOfKind=hand[0].kind;
            result.twoPair=hand[3].kind;
            result.fullHouse=1;
        }
        if(hand[2].kind==hand[3].kind && hand[2].kind==hand[4].kind && hand[0].kind==hand[1].kind && hand[0].kind!=hand[2].kind)
        {
            result.threeOfKind=hand[2].kind;
            result.twoPair=hand[0].kind;
            result.fullHouse=1;
        }
        return (result);
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2147483635)
    private void evaluateFourOfKind(Card[] hand)
    {
HandStrength result=new void HandStrength();
        result.fifthKicker=0;
        result.fourthKicker=0;
        result.thirdKicker=0;
        result.secondKicker=0;
        result.firstKicker=0;
        result.onePair=0;
        result.twoPair=0;
        result.threeOfKind=0;
        result.straight=0;
        result.flush=0;
        result.fullHouse=0;
        result.fourOfKind=0;
        result.straightFlush=0;
        if(hand[0].kind==hand[1].kind && hand[0].kind==hand[2].kind && hand[0].kind==hand[3].kind && hand[0].kind!=hand[4].kind)
        {
            result.onePair=hand[0].kind;
            result.twoPair=hand[0].kind;
            result.firstKicker=hand[4].kind;
            result.fourOfKind=1;
        }
        if(hand[1].kind==hand[2].kind && hand[1].kind==hand[3].kind && hand[1].kind==hand[4].kind && hand[1].kind!=hand[0].kind)
        {
            result.onePair=hand[1].kind;
            result.twoPair=hand[1].kind;
            result.firstKicker=hand[0].kind;
            result.fourOfKind=1;
        }
        return (result);
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2147483634)
    private void evaluateStraightFlush(Card[] hand)
    {
HandStrength result=new void HandStrength();
HandStrength straight=null;
HandStrength flush=null;
        straight=void evaluateStraight(hand);
        flush=void evaluateFlush(hand);
        if(straight.straight== 1 && flush.flush== 1)
        {
            result.flush=flush.flush;
            result.straight=straight.straight;
            result.straightFlush=1;
        }
        return (result);
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2147483633)
    private void evaluateKickers(Card[] hand)
    {
HandStrength result=new void HandStrength();
        result.fifthKicker=0;
        result.fourthKicker=0;
        result.thirdKicker=0;
        result.secondKicker=0;
        result.firstKicker=0;
        result.onePair=0;
        result.twoPair=0;
        result.threeOfKind=0;
        result.straight=0;
        result.flush=0;
        result.fullHouse=0;
        result.fourOfKind=0;
        result.straightFlush=0;
        result.firstKicker=hand[0].kind;
        result.secondKicker=hand[1].kind;
        result.thirdKicker=hand[2].kind;
        result.fourthKicker=hand[3].kind;
        result.fifthKicker=hand[4].kind;
        return (result);
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2147483632)
    private void evaluateHand(Card[] hand)
    {
long result=0L;
HandStrength strength=null;
        strength=void evaluateOnePair(hand);
        result|=void strength.getValue();
        strength=void evaluateTwoPair(hand);
        result|=void strength.getValue();
        strength=void evaluateThreeOfKind(hand);
        result|=void strength.getValue();
        strength=void evaluateStraight(hand);
        result|=void strength.getValue();
        strength=void evaluateFlush(hand);
        result|=void strength.getValue();
        strength=void evaluateFullHouse(hand);
        result|=void strength.getValue();
        strength=void evaluateFourOfKind(hand);
        result|=void strength.getValue();
        strength=void evaluateStraightFlush(hand);
        result|=void strength.getValue();
        if(result== 0L)
        {
            strength=void evaluateKickers(hand);
            result|=void strength.getValue();
        }
        return (result);
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2147483631)
    private void formFiveCardsHand(Card[] hand, int index, Player player, Board board)
    {
final int[][] combinations={ { 0, 0, 1, 1, 1, 1, 1 }, { 0, 1, 0, 1, 1, 1, 1 }, { 0, 1, 1, 0, 1, 1, 1 }, { 0, 1, 1, 1, 0, 1, 1 }, { 0, 1, 1, 1, 1, 0, 1 }, { 0, 1, 1, 1, 1, 1, 0 }, { 1, 0, 0, 1, 1, 1, 1 }, { 1, 0, 1, 0, 1, 1, 1 }, { 1, 0, 1, 1, 0, 1, 1 }, { 1, 0, 1, 1, 1, 0, 1 }, { 1, 0, 1, 1, 1, 1, 0 }, { 1, 1, 0, 0, 1, 1, 1 }, { 1, 1, 0, 1, 0, 1, 1 }, { 1, 1, 0, 1, 1, 0, 1 }, { 1, 1, 0, 1, 1, 1, 0 }, { 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 0, 1, 0, 1 }, { 1, 1, 1, 0, 1, 1, 0 }, { 1, 1, 1, 1, 0, 0, 1 }, { 1, 1, 1, 1, 0, 1, 0 }, { 1, 1, 1, 1, 1, 0, 0 } };
Card[] allCards=new Card[Constants.NUMBER_OF_KNOWN_CARDS];
        allCards[0] =player.hand[0];
        allCards[1] =player.hand[1];
        allCards[2] =board.flop[0];
        allCards[3] =board.flop[1];
        allCards[4] =board.flop[2];
        allCards[5] =board.turn;
        allCards[6] =board.river;
        if(index< 0 || index>=Constants.NUMBER_OF_POSSIBLE_HANDS_FOR_EVALUATION)
        {
            return ;
        }
        for(int i=0,j=0; i<Constants.NUMBER_OF_KNOWN_CARDS; i++)
        {
            if(combinations[index][i] == 1)
            {
                hand[j] =allCards[i];
                j++;
            }
        }
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2147483630)
    private void sortWithLeadingAce(Card[] hand)
    {
int i=0;
int done=0;
Card swap=null;
        while(done== 0)
        {
            done=1;
            for(i=0; i<Constants.NUMBER_OF_EVALUATION_HAND_CARDS- 1; i++)
            {
                if(hand[i].kind<hand[i+ 1].kind)
                {
                    swap=hand[i];
                    hand[i] =hand[i+ 1];
                    hand[i+ 1] =swap;
                    done=0;
                }
            }
        }
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2147483629)
    private void sortWithoutLeadingAce(Card[] hand)
    {
int i=0;
int done=0;
Card swap=null;
        while(done== 0)
        {
            done=1;
            for(i=0; i<Constants.NUMBER_OF_EVALUATION_HAND_CARDS- 1; i++)
            {
int left=((hand[i].kind==Constants.CARD_KIND_ACE) ?Constants.CARD_KIND_WEAK_ACE:hand[i].kind);
int right=((hand[i+ 1].kind==Constants.CARD_KIND_ACE) ?Constants.CARD_KIND_WEAK_ACE:hand[i+ 1].kind);
                if(left<right)
                {
                    swap=hand[i];
                    hand[i] =hand[i+ 1];
                    hand[i+ 1] =swap;
                    done=0;
                }
            }
        }
    }

    @MOCompilerControl(checkLink=true, checkShell=true, compile=true, checkCloned=false, checkPermission=true, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=true, timeEfficiency=true, offload=true)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2147483628)
    private void calculatePlayersHandScore(Game game, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        if(mOAttributes==null && void getFirstLatticeManagedObject()!=null)
        {
            return void ((MonteCarlo)void getFirstLatticeManagedObject()).calculatePlayersHandScore(game, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
        }
        else
        {
            if(!checkMOLink(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2147483628,game,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_COMPILER_CLASS_ID_$, -2147483628))
            {
                if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2147483628,game,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
                {
    throw new void MOPermissionDeniedException();
                }
                void $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2147483628);
                void $_MANAGED_object_COMPILER_DATA_$.maxIntelligenceCounter();
                if(void HSystem.offload())
                {
int[] searchAttributes=new int[5];
                    void System.arraycopy(void getAttributesShell($_MANAGED_object_COMPILER_DATA_$, this), 0, searchAttributes, 0, 2);
                    searchAttributes[2]=Integer.MIN_VALUE;
                    searchAttributes[4]=Integer.MIN_VALUE;
Node[] offloadTarget=void latticeSearchLocalMOLink(searchAttributes, new int[0], null, new int[]{1, 1, 1, 0, 1}, 2, HSystem.defaultNumCheckNodes, false, $_MANAGED_object_COMPILER_DATA_$, this);
                    if(offloadTarget.length>0 && !void HSystem.SID.equalsSID(void offloadTarget[0].mO.getSID()) && offloadTarget[0].mO instanceof MonteCarlo)
                    {
                        return void ((MonteCarlo)offloadTarget[0].mO).calculatePlayersHandScore(game, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                    }
                    if(offloadTarget.length>1 && !void HSystem.SID.equalsSID(void offloadTarget[1].mO.getSID()) && offloadTarget[1].mO instanceof MonteCarlo)
                    {
                        return void ((MonteCarlo)offloadTarget[1].mO).calculatePlayersHandScore(game, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                    }
                }
                for(int i=0; i<game.numberOfPlayers; i++)
                {
Card[] hand=new Card[Constants.NUMBER_OF_EVALUATION_HAND_CARDS];
                    for(int j=0; j<Constants.NUMBER_OF_POSSIBLE_HANDS_FOR_EVALUATION; j++)
                    {
long score=0L;
                        game.players[i].handScore=0L;
                        void formFiveCardsHand(hand, j, game.players[i], game.board);
                        void sortWithoutLeadingAce(hand);
                        score=void evaluateHand(hand);
                        if(score>game.players[i].handScore)
                        {
                            game.players[i].handScore=score;
                        }
                        void sortWithLeadingAce(hand);
                        score=void evaluateHand(hand);
                        if(score>game.players[i].handScore)
                        {
                            game.players[i].handScore=score;
                        }
                    }
                }
                Object[] $_MANAGED_object_COMPILER_RETURN_MESSAGE_$=new Object[]{$_MANAGED_object_COMPILER_DATA_$, this,$_MANAGED_object_RETURN_MANAGED_OBJECT_$,$_MANAGED_object_COMPILER_aggregateThenCall_Object$$_ByteArrayWrapper_ManagedObject_$,game};
                if(void $_MANAGED_object_COMPILER_DATA_$.sendToMOThread())
                {
Node[] $_MANAGED_object_COMPILER_SEARCH_RESULT_$=void latticeSearchLocalMOThread(1, HSystem.mOThreadMaxSearches, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_COMPILER_DATA_$, this);
                    if(!($_MANAGED_object_COMPILER_SEARCH_RESULT_$.length>0 && $_MANAGED_object_COMPILER_SEARCH_RESULT_$[0].mO instanceof MOThread))
                    {
                        $_MANAGED_object_COMPILER_SEARCH_RESULT_$=new Node[]{new void Node(void HSystem.getBestMOThread())};
                    }
                    void ((MOThread)($_MANAGED_object_COMPILER_SEARCH_RESULT_$[0].mO)).addToRun(new Object[]{$_MANAGED_object_COMPILER_DATA_$, this, null, null, new Object[]{$_MANAGED_object_COMPILER_DATA_$, this,$_MANAGED_object_RETURN_MANAGED_OBJECT_$,$_MANAGED_object_COMPILER_aggregateThenCall_Object$$_ByteArrayWrapper_ManagedObject_$,$_MANAGED_object_COMPILER_RETURN_MESSAGE_$}}, $_MANAGED_object_COMPILER_DATA_$, this);
                }
                else
                {
                    void $_MANAGED_object_COMPILER_DATA_$.incrementMethodCallCount();
                    void ((ManagedObject)$_MANAGED_object_COMPILER_RETURN_MESSAGE_$[2]).aggregateThenCall($_MANAGED_object_COMPILER_RETURN_MESSAGE_$, $_MANAGED_object_COMPILER_DATA_$, this);
                }
                return null;
            }
            else
            {
                return null;
            }
        }
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2147483627)
    private void updateWinsCounter()
    {
int howManyBest=0;
int bestScoreIndex=0;
        for(int i=0; i<void getGame().numberOfPlayers; i++)
        {
            if(void getGame().players[i].handScore>void getGame().players[bestScoreIndex].handScore)
            {
                bestScoreIndex=i;
            }
        }
        for(int i=0; i<void getGame().numberOfPlayers; i++)
        {
            if(void getGame().players[i].handScore==void getGame().players[bestScoreIndex].handScore)
            {
                howManyBest++;
            }
        }
        if(howManyBest== 1)
        {
            void getGame().players[bestScoreIndex].winsCounter++;
        }
        else if(howManyBest> 1)
        {
            for(int i=0; i<void getGame().numberOfPlayers; i++)
            {
                if(void getGame().players[i].handScore==void getGame().players[bestScoreIndex].handScore)
                {
                    void getGame().players[i].tiesCounter++;
                }
            }
        }
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2147483626)
    public void MonteCarlo(String knownCards, long numberOfLoops, int numberOfPlayers) throws MOPermissionDeniedException, TimeOutException
    {
        for(CompareMessage[] permission: void HSystem.getDefaultPermission(ManagedObject.class))
        {
            void addPermission(permission, null, this);
        }
        for(CompareMessage[] permission: void HSystem.getDefaultPermission(MonteCarlo.class))
        {
            void addPermission(permission, null, this);
        }
        if(numberOfPlayers<Constants.MIN_NUMBER_OF_PLAYERS)
        {
            numberOfPlayers=Constants.MIN_NUMBER_OF_PLAYERS;
        }
        if(numberOfPlayers>Constants.MAX_NUMBER_OF_PLAYERS)
        {
            numberOfPlayers=Constants.MAX_NUMBER_OF_PLAYERS;
        }
        if(numberOfLoops<Constants.MIN_NUMBER_OF_LOOPS)
        {
            numberOfLoops=Constants.MIN_NUMBER_OF_LOOPS;
        }
        if(numberOfLoops>Constants.MAX_NUMBER_OF_LOOPS)
        {
            numberOfLoops=Constants.MAX_NUMBER_OF_LOOPS;
        }
        void init(numberOfPlayers);
        this.knownCards=knownCards;
this.numberOfLoops=numberOfLoops;
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2147483625)
synchronized public void willWinIn()
    {
        return ((double) 100.0 *void getGame().players[Constants.HUMAN_PLAYER_INDEX].winsCounter/ (double)currentLoop);
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2147483624)
synchronized public void willNotLooseIn()
    {
        return ((double) 100.0 * (void getGame().players[Constants.HUMAN_PLAYER_INDEX].winsCounter+void getGame().players[Constants.HUMAN_PLAYER_INDEX].tiesCounter) / (double)currentLoop);
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2147483623)
    public synchronized void stop()
    {
        running=false;
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2147483622)
    public void start()
    {
final int SLEEP_FOR_MS=0;
double result=0.0;
        running=true;
        for(currentLoop=1L; currentLoop<=numberOfLoops; currentLoop++)
        {
            void allPlayersRegular();
            void shuffle();
            void fillKnownCards();
            void deal();
ByteArrayWrapper $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_0_$=void getSID();
            void $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_0_$.toggleNoAggregateThenCall();
            game=void calculatePlayersHandScore(game, $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_0_$, this);
            void updateWinsCounter();
            if(running== false)
            {
                result=(double) 100.0 * (void getGame().players[Constants.HUMAN_PLAYER_INDEX].winsCounter+void getGame().players[Constants.HUMAN_PLAYER_INDEX].tiesCounter) / (double)currentLoop;
                return (result);
            }
        }
        result=(double) 100.0 * (void getGame().players[Constants.HUMAN_PLAYER_INDEX].winsCounter+void getGame().players[Constants.HUMAN_PLAYER_INDEX].tiesCounter) / (double)numberOfLoops;
        return (result);
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=2147483647)
    private void calculatePlayersHandScore(Game game) throws MOPermissionDeniedException, TimeOutException
    {
        void calculatePlayersHandScore(game, new void ByteArrayWrapper(), this);
    }

public static final int $_MANAGED_object_COMPILER_MonteCarlo_$=2147483647;
public static final int $_MANAGED_object_COMPILER_getGame_$=-2147483648;
public static final int $_MANAGED_object_COMPILER_init_int_$=-2147483647;
public static final int $_MANAGED_object_COMPILER_shuffle_$=-2147483646;
public static final int $_MANAGED_object_COMPILER_fillKnownCards_$=-2147483645;
public static final int $_MANAGED_object_COMPILER_deal_$=-2147483644;
public static final int $_MANAGED_object_COMPILER_allPlayersRegular_$=-2147483643;
public static final int $_MANAGED_object_COMPILER_definePlayers_int_$=-2147483642;
public static final int $_MANAGED_object_COMPILER_evaluateOnePair_Card$$_$=-2147483641;
public static final int $_MANAGED_object_COMPILER_evaluateTwoPair_Card$$_$=-2147483640;
public static final int $_MANAGED_object_COMPILER_evaluateThreeOfKind_Card$$_$=-2147483639;
public static final int $_MANAGED_object_COMPILER_evaluateStraight_Card$$_$=-2147483638;
public static final int $_MANAGED_object_COMPILER_evaluateFlush_Card$$_$=-2147483637;
public static final int $_MANAGED_object_COMPILER_evaluateFullHouse_Card$$_$=-2147483636;
public static final int $_MANAGED_object_COMPILER_evaluateFourOfKind_Card$$_$=-2147483635;
public static final int $_MANAGED_object_COMPILER_evaluateStraightFlush_Card$$_$=-2147483634;
public static final int $_MANAGED_object_COMPILER_evaluateKickers_Card$$_$=-2147483633;
public static final int $_MANAGED_object_COMPILER_evaluateHand_Card$$_$=-2147483632;
public static final int $_MANAGED_object_COMPILER_formFiveCardsHand_Card$$_int_Player_Board_$=-2147483631;
public static final int $_MANAGED_object_COMPILER_sortWithLeadingAce_Card$$_$=-2147483630;
public static final int $_MANAGED_object_COMPILER_sortWithoutLeadingAce_Card$$_$=-2147483629;
public static final int $_MANAGED_object_COMPILER_calculatePlayersHandScore_Game_ByteArrayWrapper_ManagedObject_$=-2147483628;
public static final int $_MANAGED_object_COMPILER_updateWinsCounter_$=-2147483627;
public static final int $_MANAGED_object_COMPILER_MonteCarlo_String_long_int_$=-2147483626;
public static final int $_MANAGED_object_COMPILER_willWinIn_$=-2147483625;
public static final int $_MANAGED_object_COMPILER_willNotLooseIn_$=-2147483624;
public static final int $_MANAGED_object_COMPILER_stop_$=-2147483623;
public static final int $_MANAGED_object_COMPILER_start_$=-2147483622;
public static final int $_MANAGED_object_COMPILER_calculatePlayersHandScore_Game_$=2147483647;
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=2147483647)
    public void MANAGED_object_COMPILER_RUN(Object[] message, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        switch((int)message[3])
        {
            case -2147483628:
                void calculatePlayersHandScore((Game)message[4], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            default:
        }
    }
}



class Constants {
	static final int HUMAN_PLAYER_INDEX = 0;

	static final long MIN_NUMBER_OF_LOOPS = 1L;
	static final long MAX_NUMBER_OF_LOOPS = 100000L;

	static final int MIN_NUMBER_OF_PLAYERS = 2;
	static final int MAX_NUMBER_OF_PLAYERS = 10;

	static final int NUMBER_OF_CARDS = 52;
	static final int NUMBER_OF_EVALUATION_HAND_CARDS = 5;
	static final int NUMBER_OF_POSSIBLE_HANDS_FOR_EVALUATION = 21;
	static final int NUMBER_OF_HAND_CARDS = 2;
	static final int NUMBER_OF_FLOP_CARDS = 3;
	static final int NUMBER_OF_KNOWN_CARDS = 7;

	static final int PLAYER_TYPE_REGULAR = 0x1;
	static final int PLAYER_TYPE_DEALER = 0x2;
	static final int PLAYER_TYPE_SMALL_BLIND = 0x4;
	static final int PLAYER_TYPE_BIG_BLIND = 0x8;

	static final long MIN_PLAYER_MONEY = 100L;
	static final long MAX_PLAYER_MONEY = 100000L;

	static final int CARD_KIND_WEAK_ACE = 0x1;
	static final int CARD_KIND_TWO = 0x2;
	static final int CARD_KIND_THREE = 0x3;
	static final int CARD_KIND_FOUR = 0x4;
	static final int CARD_KIND_FIVE = 0x5;
	static final int CARD_KIND_SIX = 0x6;
	static final int CARD_KIND_SEVEN = 0x7;
	static final int CARD_KIND_EIGHT = 0x8;
	static final int CARD_KIND_NINE = 0x9;
	static final int CARD_KIND_TEN = 0xA;
	static final int CARD_KIND_JACK = 0xB;
	static final int CARD_KIND_QUEEN = 0xC;
	static final int CARD_KIND_KING = 0xD;
	static final int CARD_KIND_ACE = 0xE;

	static final int CARD_SUIT_CLUBS = 0x10;
	static final int CARD_SUIT_DIAMONDS = 0x20;
	static final int CARD_SUIT_HEARTS = 0x30;
	static final int CARD_SUIT_SPADES = 0x40;
}


class Card {
	int suit;
	int kind;
	boolean known;
}


class Deck {
	Card[] cards = new Card[Constants.NUMBER_OF_CARDS];

	
	public Deck() {
		for (int i = 0; i < cards.length; i++) {
			cards[i] = new Card();
		}
	}
}


class Player {
	Card[] hand = new Card[Constants.NUMBER_OF_HAND_CARDS];
	long money;
	int type;
	long handScore;
	long winsCounter;
	long tiesCounter;

	
	public Player() {
		for (int i = 0; i < hand.length; i++) {
			hand[i] = new Card();
		}
	}
}


class Pot {
	long[] bets = new long[Constants.MAX_NUMBER_OF_PLAYERS];
	int numberOfSplits;
}


class Board {
	Card[] flop = new Card[Constants.NUMBER_OF_FLOP_CARDS];
	Card turn = new Card();
	Card river = new Card();

	
	public Board() {
		for (int i = 0; i < flop.length; i++) {
			flop[i] = new Card();
		}
	}
}


class Game {
	Deck deck = new Deck();
	Board board = new Board();
	Player[] players = new Player[Constants.MAX_NUMBER_OF_PLAYERS];
	int numberOfPlayers;
	Pot pot = new Pot();

	
	public Game() {
		for (int i = 0; i < players.length; i++) {
			players[i] = new Player();
		}
	}
}


class HandStrength {
	long fifthKicker;
	long fourthKicker;
	long thirdKicker;
	long secondKicker;
	long firstKicker;
	long onePair;
	long twoPair;
	long threeOfKind;
	long straight;
	long flush;
	long fullHouse;
	long fourOfKind;
	long straightFlush;

	
	long getValue() {
		long result = 0L;

		int offset = 0;

		
		result |= (fifthKicker << offset);
		offset += 4;

		
		result |= (fourthKicker << offset);
		offset += 4;

		
		result |= (thirdKicker << offset);
		offset += 4;

		
		result |= (secondKicker << offset);
		offset += 4;

		
		result |= (firstKicker << offset);
		offset += 4;

		
		result |= (onePair << offset);
		offset += 4;

		
		result |= (twoPair << offset);
		offset += 4;

		
		result |= (threeOfKind << offset);
		offset += 4;

		
		result |= (straight << offset);
		offset += 4;

		
		result |= (flush << offset);
		offset += 1;

		
		result |= (fullHouse << offset);
		offset += 1;

		
		result |= (fourOfKind << offset);
		offset += 1;

		
		result |= (straightFlush << offset);
		offset += 1;

		return (result);
	}
}
