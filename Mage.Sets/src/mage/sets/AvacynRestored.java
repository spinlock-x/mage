/*
 * Copyright 2011 BetaSteward_at_googlemail.com. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification, are
 * permitted provided that the following conditions are met:
 *
 *    1. Redistributions of source code must retain the above copyright notice, this list of
 *       conditions and the following disclaimer.
 *
 *    2. Redistributions in binary form must reproduce the above copyright notice, this list
 *       of conditions and the following disclaimer in the documentation and/or other materials
 *       provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY BetaSteward_at_googlemail.com ``AS IS'' AND ANY EXPRESS OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 * FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BetaSteward_at_googlemail.com OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 * ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 * ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 * The views and conclusions contained in the software and documentation are those of the
 * authors and should not be interpreted as representing official policies, either expressed
 * or implied, of BetaSteward_at_googlemail.com.
 */
package mage.sets;

import mage.constants.SetType;
import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.cards.CardGraphicInfo;

/**
 *
 * @author North
 */
public class AvacynRestored extends ExpansionSet {

    private static final AvacynRestored fINSTANCE = new AvacynRestored();

    public static AvacynRestored getInstance() {
        return fINSTANCE;
    }

    private AvacynRestored() {
        super("Avacyn Restored", "AVR", ExpansionSet.buildDate(2012, 4, 4), SetType.EXPANSION);
        this.blockName = "Innistrad";
        this.parentSet = Innistrad.getInstance();
        this.hasBoosters = true;
        this.numBoosterLands = 1;
        this.numBoosterCommon = 10;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 8;
        cards.add(new SetCardInfo("Abundant Growth", 167, Rarity.COMMON, mage.cards.a.AbundantGrowth.class));
        cards.add(new SetCardInfo("Aggravate", 125, Rarity.UNCOMMON, mage.cards.a.Aggravate.class));
        cards.add(new SetCardInfo("Alchemist's Apprentice", 42, Rarity.COMMON, mage.cards.a.AlchemistsApprentice.class));
        cards.add(new SetCardInfo("Alchemist's Refuge", 225, Rarity.RARE, mage.cards.a.AlchemistsRefuge.class));
        cards.add(new SetCardInfo("Amass the Components", 43, Rarity.COMMON, mage.cards.a.AmassTheComponents.class));
        cards.add(new SetCardInfo("Angelic Armaments", 212, Rarity.UNCOMMON, mage.cards.a.AngelicArmaments.class));
        cards.add(new SetCardInfo("Angelic Wall", 4, Rarity.COMMON, mage.cards.a.AngelicWall.class));
        cards.add(new SetCardInfo("Angel of Glory's Rise", 1, Rarity.RARE, mage.cards.a.AngelOfGlorysRise.class));
        cards.add(new SetCardInfo("Angel of Jubilation", 2, Rarity.RARE, mage.cards.a.AngelOfJubilation.class));
        cards.add(new SetCardInfo("Angel's Mercy", 3, Rarity.COMMON, mage.cards.a.AngelsMercy.class));
        cards.add(new SetCardInfo("Angel's Tomb", 211, Rarity.UNCOMMON, mage.cards.a.AngelsTomb.class));
        cards.add(new SetCardInfo("Appetite for Brains", 84, Rarity.UNCOMMON, mage.cards.a.AppetiteForBrains.class));
        cards.add(new SetCardInfo("Arcane Melee", 44, Rarity.RARE, mage.cards.a.ArcaneMelee.class));
        cards.add(new SetCardInfo("Archangel", 5, Rarity.UNCOMMON, mage.cards.a.Archangel.class));
        cards.add(new SetCardInfo("Archwing Dragon", 126, Rarity.RARE, mage.cards.a.ArchwingDragon.class));
        cards.add(new SetCardInfo("Avacyn, Angel of Hope", 6, Rarity.MYTHIC, mage.cards.a.AvacynAngelOfHope.class));
        cards.add(new SetCardInfo("Banishing Stroke", 7, Rarity.UNCOMMON, mage.cards.b.BanishingStroke.class));
        cards.add(new SetCardInfo("Banners Raised", 127, Rarity.COMMON, mage.cards.b.BannersRaised.class));
        cards.add(new SetCardInfo("Barter in Blood", 85, Rarity.UNCOMMON, mage.cards.b.BarterInBlood.class));
        cards.add(new SetCardInfo("Battle Hymn", 128, Rarity.COMMON, mage.cards.b.BattleHymn.class));
        cards.add(new SetCardInfo("Bladed Bracers", 213, Rarity.COMMON, mage.cards.b.BladedBracers.class));
        cards.add(new SetCardInfo("Blessings of Nature", 168, Rarity.UNCOMMON, mage.cards.b.BlessingsOfNature.class));
        cards.add(new SetCardInfo("Blood Artist", 86, Rarity.UNCOMMON, mage.cards.b.BloodArtist.class));
        cards.add(new SetCardInfo("Bloodflow Connoisseur", 87, Rarity.COMMON, mage.cards.b.BloodflowConnoisseur.class));
        cards.add(new SetCardInfo("Bone Splinters", 88, Rarity.COMMON, mage.cards.b.BoneSplinters.class));
        cards.add(new SetCardInfo("Bonfire of the Damned", 129, Rarity.MYTHIC, mage.cards.b.BonfireOfTheDamned.class));
        cards.add(new SetCardInfo("Borderland Ranger", 169, Rarity.COMMON, mage.cards.b.BorderlandRanger.class));
        cards.add(new SetCardInfo("Bower Passage", 170, Rarity.UNCOMMON, mage.cards.b.BowerPassage.class));
        cards.add(new SetCardInfo("Bruna, Light of Alabaster", 208, Rarity.MYTHIC, mage.cards.b.BrunaLightOfAlabaster.class));
        cards.add(new SetCardInfo("Builder's Blessing", 8, Rarity.UNCOMMON, mage.cards.b.BuildersBlessing.class));
        cards.add(new SetCardInfo("Burn at the Stake", 130, Rarity.RARE, mage.cards.b.BurnAtTheStake.class));
        cards.add(new SetCardInfo("Butcher Ghoul", 89, Rarity.COMMON, mage.cards.b.ButcherGhoul.class));
        cards.add(new SetCardInfo("Call to Serve", 9, Rarity.COMMON, mage.cards.c.CallToServe.class));
        cards.add(new SetCardInfo("Captain of the Mists", 45, Rarity.RARE, mage.cards.c.CaptainOfTheMists.class));
        cards.add(new SetCardInfo("Cathars' Crusade", 10, Rarity.RARE, mage.cards.c.CatharsCrusade.class));
        cards.add(new SetCardInfo("Cathedral Sanctifier", 11, Rarity.COMMON, mage.cards.c.CathedralSanctifier.class));
        cards.add(new SetCardInfo("Cavern of Souls", 226, Rarity.RARE, mage.cards.c.CavernOfSouls.class));
        cards.add(new SetCardInfo("Champion of Lambholt", 171, Rarity.RARE, mage.cards.c.ChampionOfLambholt.class));
        cards.add(new SetCardInfo("Cloudshift", 12, Rarity.COMMON, mage.cards.c.Cloudshift.class));
        cards.add(new SetCardInfo("Commander's Authority", 13, Rarity.UNCOMMON, mage.cards.c.CommandersAuthority.class));
        cards.add(new SetCardInfo("Conjurer's Closet", 214, Rarity.RARE, mage.cards.c.ConjurersCloset.class));
        cards.add(new SetCardInfo("Corpse Traders", 90, Rarity.UNCOMMON, mage.cards.c.CorpseTraders.class));
        cards.add(new SetCardInfo("Craterhoof Behemoth", 172, Rarity.MYTHIC, mage.cards.c.CraterhoofBehemoth.class));
        cards.add(new SetCardInfo("Crippling Chill", 46, Rarity.COMMON, mage.cards.c.CripplingChill.class));
        cards.add(new SetCardInfo("Crypt Creeper", 91, Rarity.COMMON, mage.cards.c.CryptCreeper.class));
        cards.add(new SetCardInfo("Cursebreak", 14, Rarity.COMMON, mage.cards.c.Cursebreak.class));
        cards.add(new SetCardInfo("Dangerous Wager", 131, Rarity.COMMON, mage.cards.d.DangerousWager.class));
        cards.add(new SetCardInfo("Dark Impostor", 92, Rarity.RARE, mage.cards.d.DarkImpostor.class));
        cards.add(new SetCardInfo("Deadeye Navigator", 47, Rarity.RARE, mage.cards.d.DeadeyeNavigator.class));
        cards.add(new SetCardInfo("Death Wind", 93, Rarity.COMMON, mage.cards.d.DeathWind.class));
        cards.add(new SetCardInfo("Defang", 15, Rarity.COMMON, mage.cards.d.Defang.class));
        cards.add(new SetCardInfo("Defy Death", 16, Rarity.UNCOMMON, mage.cards.d.DefyDeath.class));
        cards.add(new SetCardInfo("Demolish", 132, Rarity.COMMON, mage.cards.d.Demolish.class));
        cards.add(new SetCardInfo("Demonic Rising", 94, Rarity.RARE, mage.cards.d.DemonicRising.class));
        cards.add(new SetCardInfo("Demonic Taskmaster", 95, Rarity.UNCOMMON, mage.cards.d.DemonicTaskmaster.class));
        cards.add(new SetCardInfo("Demonlord of Ashmouth", 96, Rarity.RARE, mage.cards.d.DemonlordOfAshmouth.class));
        cards.add(new SetCardInfo("Descendants' Path", 173, Rarity.RARE, mage.cards.d.DescendantsPath.class));
        cards.add(new SetCardInfo("Descent into Madness", 97, Rarity.MYTHIC, mage.cards.d.DescentIntoMadness.class));
        cards.add(new SetCardInfo("Desolate Lighthouse", 227, Rarity.RARE, mage.cards.d.DesolateLighthouse.class));
        cards.add(new SetCardInfo("Devastation Tide", 48, Rarity.RARE, mage.cards.d.DevastationTide.class));
        cards.add(new SetCardInfo("Devout Chaplain", 17, Rarity.UNCOMMON, mage.cards.d.DevoutChaplain.class));
        cards.add(new SetCardInfo("Diregraf Escort", 174, Rarity.COMMON, mage.cards.d.DiregrafEscort.class));
        cards.add(new SetCardInfo("Divine Deflection", 18, Rarity.RARE, mage.cards.d.DivineDeflection.class));
        cards.add(new SetCardInfo("Dread Slaver", 98, Rarity.RARE, mage.cards.d.DreadSlaver.class));
        cards.add(new SetCardInfo("Dreadwaters", 49, Rarity.COMMON, mage.cards.d.Dreadwaters.class));
        cards.add(new SetCardInfo("Driver of the Dead", 99, Rarity.COMMON, mage.cards.d.DriverOfTheDead.class));
        cards.add(new SetCardInfo("Druid's Familiar", 175, Rarity.UNCOMMON, mage.cards.d.DruidsFamiliar.class));
        cards.add(new SetCardInfo("Druids' Repository", 176, Rarity.RARE, mage.cards.d.DruidsRepository.class));
        cards.add(new SetCardInfo("Dual Casting", 133, Rarity.RARE, mage.cards.d.DualCasting.class));
        cards.add(new SetCardInfo("Eaten by Spiders", 177, Rarity.UNCOMMON, mage.cards.e.EatenBySpiders.class));
        cards.add(new SetCardInfo("Elgaud Shieldmate", 50, Rarity.COMMON, mage.cards.e.ElgaudShieldmate.class));
        cards.add(new SetCardInfo("Emancipation Angel", 19, Rarity.UNCOMMON, mage.cards.e.EmancipationAngel.class));
        cards.add(new SetCardInfo("Entreat the Angels", 20, Rarity.MYTHIC, mage.cards.e.EntreatTheAngels.class));
        cards.add(new SetCardInfo("Essence Harvest", 100, Rarity.COMMON, mage.cards.e.EssenceHarvest.class));
        cards.add(new SetCardInfo("Evernight Shade", 101, Rarity.UNCOMMON, mage.cards.e.EvernightShade.class));
        cards.add(new SetCardInfo("Exquisite Blood", 102, Rarity.RARE, mage.cards.e.ExquisiteBlood.class));
        cards.add(new SetCardInfo("Falkenrath Exterminator", 134, Rarity.UNCOMMON, mage.cards.f.FalkenrathExterminator.class));
        cards.add(new SetCardInfo("Farbog Explorer", 21, Rarity.COMMON, mage.cards.f.FarbogExplorer.class));
        cards.add(new SetCardInfo("Favorable Winds", 51, Rarity.UNCOMMON, mage.cards.f.FavorableWinds.class));
        cards.add(new SetCardInfo("Fervent Cathar", 135, Rarity.COMMON, mage.cards.f.FerventCathar.class));
        cards.add(new SetCardInfo("Fettergeist", 52, Rarity.UNCOMMON, mage.cards.f.Fettergeist.class));
        cards.add(new SetCardInfo("Fleeting Distraction", 53, Rarity.COMMON, mage.cards.f.FleetingDistraction.class));
        cards.add(new SetCardInfo("Flowering Lumberknot", 178, Rarity.COMMON, mage.cards.f.FloweringLumberknot.class));
        cards.add(new SetCardInfo("Forest", 242, Rarity.LAND, mage.cards.basiclands.Forest.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Forest", 243, Rarity.LAND, mage.cards.basiclands.Forest.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Forest", 244, Rarity.LAND, mage.cards.basiclands.Forest.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Gallows at Willow Hill", 215, Rarity.RARE, mage.cards.g.GallowsAtWillowHill.class));
        cards.add(new SetCardInfo("Galvanic Alchemist", 54, Rarity.COMMON, mage.cards.g.GalvanicAlchemist.class));
        cards.add(new SetCardInfo("Gang of Devils", 136, Rarity.UNCOMMON, mage.cards.g.GangOfDevils.class));
        cards.add(new SetCardInfo("Geist Snatch", 55, Rarity.COMMON, mage.cards.g.GeistSnatch.class));
        cards.add(new SetCardInfo("Geist Trappers", 179, Rarity.COMMON, mage.cards.g.GeistTrappers.class));
        cards.add(new SetCardInfo("Ghostform", 56, Rarity.COMMON, mage.cards.g.Ghostform.class));
        cards.add(new SetCardInfo("Ghostly Flicker", 57, Rarity.COMMON, mage.cards.g.GhostlyFlicker.class));
        cards.add(new SetCardInfo("Ghostly Touch", 58, Rarity.UNCOMMON, mage.cards.g.GhostlyTouch.class));
        cards.add(new SetCardInfo("Ghoulflesh", 103, Rarity.COMMON, mage.cards.g.Ghoulflesh.class));
        cards.add(new SetCardInfo("Gisela, Blade of Goldnight", 209, Rarity.MYTHIC, mage.cards.g.GiselaBladeOfGoldnight.class));
        cards.add(new SetCardInfo("Gloom Surgeon", 104, Rarity.RARE, mage.cards.g.GloomSurgeon.class));
        cards.add(new SetCardInfo("Gloomwidow", 180, Rarity.UNCOMMON, mage.cards.g.Gloomwidow.class));
        cards.add(new SetCardInfo("Goldnight Commander", 22, Rarity.UNCOMMON, mage.cards.g.GoldnightCommander.class));
        cards.add(new SetCardInfo("Goldnight Redeemer", 23, Rarity.UNCOMMON, mage.cards.g.GoldnightRedeemer.class));
        cards.add(new SetCardInfo("Grave Exchange", 105, Rarity.COMMON, mage.cards.g.GraveExchange.class));
        cards.add(new SetCardInfo("Griselbrand", 106, Rarity.MYTHIC, mage.cards.g.Griselbrand.class));
        cards.add(new SetCardInfo("Grounded", 181, Rarity.COMMON, mage.cards.g.Grounded.class));
        cards.add(new SetCardInfo("Gryff Vanguard", 59, Rarity.COMMON, mage.cards.g.GryffVanguard.class));
        cards.add(new SetCardInfo("Guise of Fire", 137, Rarity.COMMON, mage.cards.g.GuiseOfFire.class));
        cards.add(new SetCardInfo("Hanweir Lancer", 138, Rarity.COMMON, mage.cards.h.HanweirLancer.class));
        cards.add(new SetCardInfo("Harvester of Souls", 107, Rarity.RARE, mage.cards.h.HarvesterOfSouls.class));
        cards.add(new SetCardInfo("Haunted Guardian", 216, Rarity.UNCOMMON, mage.cards.h.HauntedGuardian.class));
        cards.add(new SetCardInfo("Havengul Skaab", 60, Rarity.COMMON, mage.cards.h.HavengulSkaab.class));
        cards.add(new SetCardInfo("Havengul Vampire", 139, Rarity.UNCOMMON, mage.cards.h.HavengulVampire.class));
        cards.add(new SetCardInfo("Heirs of Stromkirk", 140, Rarity.COMMON, mage.cards.h.HeirsOfStromkirk.class));
        cards.add(new SetCardInfo("Herald of War", 24, Rarity.RARE, mage.cards.h.HeraldOfWar.class));
        cards.add(new SetCardInfo("Holy Justiciar", 25, Rarity.UNCOMMON, mage.cards.h.HolyJusticiar.class));
        cards.add(new SetCardInfo("Homicidal Seclusion", 108, Rarity.UNCOMMON, mage.cards.h.HomicidalSeclusion.class));
        cards.add(new SetCardInfo("Hound of Griselbrand", 141, Rarity.RARE, mage.cards.h.HoundOfGriselbrand.class));
        cards.add(new SetCardInfo("Howlgeist", 182, Rarity.UNCOMMON, mage.cards.h.Howlgeist.class));
        cards.add(new SetCardInfo("Human Frailty", 109, Rarity.UNCOMMON, mage.cards.h.HumanFrailty.class));
        cards.add(new SetCardInfo("Hunted Ghoul", 110, Rarity.COMMON, mage.cards.h.HuntedGhoul.class));
        cards.add(new SetCardInfo("Infinite Reflection", 61, Rarity.RARE, mage.cards.i.InfiniteReflection.class));
        cards.add(new SetCardInfo("Into the Void", 62, Rarity.UNCOMMON, mage.cards.i.IntoTheVoid.class));
        cards.add(new SetCardInfo("Island", 233, Rarity.LAND, mage.cards.basiclands.Island.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Island", 234, Rarity.LAND, mage.cards.basiclands.Island.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Island", 235, Rarity.LAND, mage.cards.basiclands.Island.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Joint Assault", 183, Rarity.COMMON, mage.cards.j.JointAssault.class));
        cards.add(new SetCardInfo("Kessig Malcontents", 142, Rarity.UNCOMMON, mage.cards.k.KessigMalcontents.class));
        cards.add(new SetCardInfo("Killing Wave", 111, Rarity.RARE, mage.cards.k.KillingWave.class));
        cards.add(new SetCardInfo("Kruin Striker", 143, Rarity.COMMON, mage.cards.k.KruinStriker.class));
        cards.add(new SetCardInfo("Lair Delve", 184, Rarity.COMMON, mage.cards.l.LairDelve.class));
        cards.add(new SetCardInfo("Latch Seeker", 63, Rarity.UNCOMMON, mage.cards.l.LatchSeeker.class));
        cards.add(new SetCardInfo("Leap of Faith", 26, Rarity.COMMON, mage.cards.l.LeapOfFaith.class));
        cards.add(new SetCardInfo("Lightning Mauler", 144, Rarity.UNCOMMON, mage.cards.l.LightningMauler.class));
        cards.add(new SetCardInfo("Lightning Prowess", 145, Rarity.UNCOMMON, mage.cards.l.LightningProwess.class));
        cards.add(new SetCardInfo("Lone Revenant", 64, Rarity.RARE, mage.cards.l.LoneRevenant.class));
        cards.add(new SetCardInfo("Lunar Mystic", 65, Rarity.RARE, mage.cards.l.LunarMystic.class));
        cards.add(new SetCardInfo("Maalfeld Twins", 112, Rarity.UNCOMMON, mage.cards.m.MaalfeldTwins.class));
        cards.add(new SetCardInfo("Mad Prophet", 146, Rarity.COMMON, mage.cards.m.MadProphet.class));
        cards.add(new SetCardInfo("Malicious Intent", 147, Rarity.COMMON, mage.cards.m.MaliciousIntent.class));
        cards.add(new SetCardInfo("Malignus", 148, Rarity.MYTHIC, mage.cards.m.Malignus.class));
        cards.add(new SetCardInfo("Marrow Bats", 113, Rarity.UNCOMMON, mage.cards.m.MarrowBats.class));
        cards.add(new SetCardInfo("Mass Appeal", 66, Rarity.UNCOMMON, mage.cards.m.MassAppeal.class));
        cards.add(new SetCardInfo("Mental Agony", 114, Rarity.COMMON, mage.cards.m.MentalAgony.class));
        cards.add(new SetCardInfo("Midnight Duelist", 27, Rarity.COMMON, mage.cards.m.MidnightDuelist.class));
        cards.add(new SetCardInfo("Midvast Protector", 28, Rarity.COMMON, mage.cards.m.MidvastProtector.class));
        cards.add(new SetCardInfo("Misthollow Griffin", 68, Rarity.MYTHIC, mage.cards.m.MisthollowGriffin.class));
        cards.add(new SetCardInfo("Mist Raven", 67, Rarity.COMMON, mage.cards.m.MistRaven.class));
        cards.add(new SetCardInfo("Moonlight Geist", 29, Rarity.COMMON, mage.cards.m.MoonlightGeist.class));
        cards.add(new SetCardInfo("Moonsilver Spear", 217, Rarity.RARE, mage.cards.m.MoonsilverSpear.class));
        cards.add(new SetCardInfo("Moorland Inquisitor", 30, Rarity.COMMON, mage.cards.m.MoorlandInquisitor.class));
        cards.add(new SetCardInfo("Mountain", 239, Rarity.LAND, mage.cards.basiclands.Mountain.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Mountain", 240, Rarity.LAND, mage.cards.basiclands.Mountain.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Mountain", 241, Rarity.LAND, mage.cards.basiclands.Mountain.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Narstad Scrapper", 218, Rarity.COMMON, mage.cards.n.NarstadScrapper.class));
        cards.add(new SetCardInfo("Natural End", 185, Rarity.COMMON, mage.cards.n.NaturalEnd.class));
        cards.add(new SetCardInfo("Nearheath Pilgrim", 31, Rarity.UNCOMMON, mage.cards.n.NearheathPilgrim.class));
        cards.add(new SetCardInfo("Necrobite", 115, Rarity.COMMON, mage.cards.n.Necrobite.class));
        cards.add(new SetCardInfo("Nephalia Smuggler", 69, Rarity.UNCOMMON, mage.cards.n.NephaliaSmuggler.class));
        cards.add(new SetCardInfo("Nettle Swine", 186, Rarity.COMMON, mage.cards.n.NettleSwine.class));
        cards.add(new SetCardInfo("Nightshade Peddler", 187, Rarity.COMMON, mage.cards.n.NightshadePeddler.class));
        cards.add(new SetCardInfo("Otherworld Atlas", 219, Rarity.RARE, mage.cards.o.OtherworldAtlas.class));
        cards.add(new SetCardInfo("Outwit", 70, Rarity.COMMON, mage.cards.o.Outwit.class));
        cards.add(new SetCardInfo("Pathbreaker Wurm", 188, Rarity.COMMON, mage.cards.p.PathbreakerWurm.class));
        cards.add(new SetCardInfo("Peel from Reality", 71, Rarity.COMMON, mage.cards.p.PeelFromReality.class));
        cards.add(new SetCardInfo("Pillar of Flame", 149, Rarity.COMMON, mage.cards.p.PillarOfFlame.class));
        cards.add(new SetCardInfo("Plains", 230, Rarity.LAND, mage.cards.basiclands.Plains.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Plains", 231, Rarity.LAND, mage.cards.basiclands.Plains.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Plains", 232, Rarity.LAND, mage.cards.basiclands.Plains.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Polluted Dead", 116, Rarity.COMMON, mage.cards.p.PollutedDead.class));
        cards.add(new SetCardInfo("Predator's Gambit", 117, Rarity.COMMON, mage.cards.p.PredatorsGambit.class));
        cards.add(new SetCardInfo("Primal Surge", 189, Rarity.MYTHIC, mage.cards.p.PrimalSurge.class));
        cards.add(new SetCardInfo("Raging Poltergeist", 150, Rarity.COMMON, mage.cards.r.RagingPoltergeist.class));
        cards.add(new SetCardInfo("Rain of Thorns", 190, Rarity.UNCOMMON, mage.cards.r.RainOfThorns.class));
        cards.add(new SetCardInfo("Reforge the Soul", 151, Rarity.RARE, mage.cards.r.ReforgeTheSoul.class));
        cards.add(new SetCardInfo("Renegade Demon", 118, Rarity.COMMON, mage.cards.r.RenegadeDemon.class));
        cards.add(new SetCardInfo("Restoration Angel", 32, Rarity.RARE, mage.cards.r.RestorationAngel.class));
        cards.add(new SetCardInfo("Revenge of the Hunted", 191, Rarity.RARE, mage.cards.r.RevengeOfTheHunted.class));
        cards.add(new SetCardInfo("Riders of Gavony", 33, Rarity.RARE, mage.cards.r.RidersOfGavony.class));
        cards.add(new SetCardInfo("Righteous Blow", 34, Rarity.COMMON, mage.cards.r.RighteousBlow.class));
        cards.add(new SetCardInfo("Riot Ringleader", 152, Rarity.COMMON, mage.cards.r.RiotRingleader.class));
        cards.add(new SetCardInfo("Rite of Ruin", 153, Rarity.RARE, mage.cards.r.RiteOfRuin.class));
        cards.add(new SetCardInfo("Rotcrown Ghoul", 72, Rarity.COMMON, mage.cards.r.RotcrownGhoul.class));
        cards.add(new SetCardInfo("Rush of Blood", 154, Rarity.UNCOMMON, mage.cards.r.RushOfBlood.class));
        cards.add(new SetCardInfo("Scalding Devil", 155, Rarity.COMMON, mage.cards.s.ScaldingDevil.class));
        cards.add(new SetCardInfo("Scrapskin Drake", 73, Rarity.COMMON, mage.cards.s.ScrapskinDrake.class));
        cards.add(new SetCardInfo("Scroll of Avacyn", 220, Rarity.COMMON, mage.cards.s.ScrollOfAvacyn.class));
        cards.add(new SetCardInfo("Scroll of Griselbrand", 221, Rarity.COMMON, mage.cards.s.ScrollOfGriselbrand.class));
        cards.add(new SetCardInfo("Searchlight Geist", 119, Rarity.COMMON, mage.cards.s.SearchlightGeist.class));
        cards.add(new SetCardInfo("Second Guess", 74, Rarity.UNCOMMON, mage.cards.s.SecondGuess.class));
        cards.add(new SetCardInfo("Seraph of Dawn", 35, Rarity.COMMON, mage.cards.s.SeraphOfDawn.class));
        cards.add(new SetCardInfo("Seraph Sanctuary", 228, Rarity.COMMON, mage.cards.s.SeraphSanctuary.class));
        cards.add(new SetCardInfo("Sheltering Word", 192, Rarity.COMMON, mage.cards.s.ShelteringWord.class));
        cards.add(new SetCardInfo("Sigarda, Host of Herons", 210, Rarity.MYTHIC, mage.cards.s.SigardaHostOfHerons.class));
        cards.add(new SetCardInfo("Silverblade Paladin", 36, Rarity.RARE, mage.cards.s.SilverbladePaladin.class));
        cards.add(new SetCardInfo("Slayers' Stronghold", 229, Rarity.RARE, mage.cards.s.SlayersStronghold.class));
        cards.add(new SetCardInfo("Snare the Skies", 193, Rarity.COMMON, mage.cards.s.SnareTheSkies.class));
        cards.add(new SetCardInfo("Somberwald Sage", 194, Rarity.RARE, mage.cards.s.SomberwaldSage.class));
        cards.add(new SetCardInfo("Somberwald Vigilante", 156, Rarity.COMMON, mage.cards.s.SomberwaldVigilante.class));
        cards.add(new SetCardInfo("Soulcage Fiend", 120, Rarity.COMMON, mage.cards.s.SoulcageFiend.class));
        cards.add(new SetCardInfo("Soul of the Harvest", 195, Rarity.RARE, mage.cards.s.SoulOfTheHarvest.class));
        cards.add(new SetCardInfo("Spectral Gateguards", 37, Rarity.COMMON, mage.cards.s.SpectralGateguards.class));
        cards.add(new SetCardInfo("Spectral Prison", 75, Rarity.COMMON, mage.cards.s.SpectralPrison.class));
        cards.add(new SetCardInfo("Spirit Away", 76, Rarity.RARE, mage.cards.s.SpiritAway.class));
        cards.add(new SetCardInfo("Stern Mentor", 77, Rarity.UNCOMMON, mage.cards.s.SternMentor.class));
        cards.add(new SetCardInfo("Stolen Goods", 78, Rarity.RARE, mage.cards.s.StolenGoods.class));
        cards.add(new SetCardInfo("Stonewright", 157, Rarity.UNCOMMON, mage.cards.s.Stonewright.class));
        cards.add(new SetCardInfo("Swamp", 236, Rarity.LAND, mage.cards.basiclands.Swamp.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Swamp", 237, Rarity.LAND, mage.cards.basiclands.Swamp.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Swamp", 238, Rarity.LAND, mage.cards.basiclands.Swamp.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Tamiyo, the Moon Sage", 79, Rarity.MYTHIC, mage.cards.t.TamiyoTheMoonSage.class));
        cards.add(new SetCardInfo("Tandem Lookout", 80, Rarity.UNCOMMON, mage.cards.t.TandemLookout.class));
        cards.add(new SetCardInfo("Temporal Mastery", 81, Rarity.MYTHIC, mage.cards.t.TemporalMastery.class));
        cards.add(new SetCardInfo("Terminus", 38, Rarity.RARE, mage.cards.t.Terminus.class));
        cards.add(new SetCardInfo("Terrifying Presence", 196, Rarity.COMMON, mage.cards.t.TerrifyingPresence.class));
        cards.add(new SetCardInfo("Thatcher Revolt", 158, Rarity.COMMON, mage.cards.t.ThatcherRevolt.class));
        cards.add(new SetCardInfo("Thraben Valiant", 39, Rarity.COMMON, mage.cards.t.ThrabenValiant.class));
        cards.add(new SetCardInfo("Thunderbolt", 159, Rarity.COMMON, mage.cards.t.Thunderbolt.class));
        cards.add(new SetCardInfo("Thunderous Wrath", 160, Rarity.UNCOMMON, mage.cards.t.ThunderousWrath.class));
        cards.add(new SetCardInfo("Tibalt, the Fiend-Blooded", 161, Rarity.MYTHIC, mage.cards.t.TibaltTheFiendBlooded.class));
        cards.add(new SetCardInfo("Timberland Guide", 197, Rarity.COMMON, mage.cards.t.TimberlandGuide.class));
        cards.add(new SetCardInfo("Tormentor's Trident", 222, Rarity.UNCOMMON, mage.cards.t.TormentorsTrident.class));
        cards.add(new SetCardInfo("Treacherous Pit-Dweller", 121, Rarity.RARE, mage.cards.t.TreacherousPitDweller.class));
        cards.add(new SetCardInfo("Triumph of Cruelty", 122, Rarity.UNCOMMON, mage.cards.t.TriumphOfCruelty.class));
        cards.add(new SetCardInfo("Triumph of Ferocity", 198, Rarity.UNCOMMON, mage.cards.t.TriumphOfFerocity.class));
        cards.add(new SetCardInfo("Trusted Forcemage", 199, Rarity.COMMON, mage.cards.t.TrustedForcemage.class));
        cards.add(new SetCardInfo("Tyrant of Discord", 162, Rarity.RARE, mage.cards.t.TyrantOfDiscord.class));
        cards.add(new SetCardInfo("Ulvenwald Tracker", 200, Rarity.RARE, mage.cards.u.UlvenwaldTracker.class));
        cards.add(new SetCardInfo("Uncanny Speed", 163, Rarity.COMMON, mage.cards.u.UncannySpeed.class));
        cards.add(new SetCardInfo("Undead Executioner", 123, Rarity.COMMON, mage.cards.u.UndeadExecutioner.class));
        cards.add(new SetCardInfo("Unhallowed Pact", 124, Rarity.COMMON, mage.cards.u.UnhallowedPact.class));
        cards.add(new SetCardInfo("Vanguard's Shield", 223, Rarity.COMMON, mage.cards.v.VanguardsShield.class));
        cards.add(new SetCardInfo("Vanishment", 82, Rarity.UNCOMMON, mage.cards.v.Vanishment.class));
        cards.add(new SetCardInfo("Vessel of Endless Rest", 224, Rarity.UNCOMMON, mage.cards.v.VesselOfEndlessRest.class));
        cards.add(new SetCardInfo("Vexing Devil", 164, Rarity.RARE, mage.cards.v.VexingDevil.class));
        cards.add(new SetCardInfo("Vigilante Justice", 165, Rarity.UNCOMMON, mage.cards.v.VigilanteJustice.class));
        cards.add(new SetCardInfo("Voice of the Provinces", 40, Rarity.COMMON, mage.cards.v.VoiceOfTheProvinces.class));
        cards.add(new SetCardInfo("Vorstclaw", 201, Rarity.UNCOMMON, mage.cards.v.Vorstclaw.class));
        cards.add(new SetCardInfo("Wandering Wolf", 202, Rarity.COMMON, mage.cards.w.WanderingWolf.class));
        cards.add(new SetCardInfo("Wild Defiance", 203, Rarity.RARE, mage.cards.w.WildDefiance.class));
        cards.add(new SetCardInfo("Wildwood Geist", 204, Rarity.COMMON, mage.cards.w.WildwoodGeist.class));
        cards.add(new SetCardInfo("Wingcrafter", 83, Rarity.COMMON, mage.cards.w.Wingcrafter.class));
        cards.add(new SetCardInfo("Wolfir Avenger", 205, Rarity.UNCOMMON, mage.cards.w.WolfirAvenger.class));
        cards.add(new SetCardInfo("Wolfir Silverheart", 206, Rarity.RARE, mage.cards.w.WolfirSilverheart.class));
        cards.add(new SetCardInfo("Yew Spirit", 207, Rarity.UNCOMMON, mage.cards.y.YewSpirit.class));
        cards.add(new SetCardInfo("Zealous Conscripts", 166, Rarity.RARE, mage.cards.z.ZealousConscripts.class));
        cards.add(new SetCardInfo("Zealous Strike", 41, Rarity.COMMON, mage.cards.z.ZealousStrike.class));
    }
}
