/*    */ import java.io.DataInput;
/*    */ import java.io.DataOutput;
/*    */ import java.io.IOException;
import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ 
/*    */ public class NBTTagList extends NBTBase {
/*  7 */   private List a = new ArrayList();
/*    */   private byte b;
/*    */   
/*    */   void writeTagContents(DataOutput paramDataOutput) throws IOException {
/* 11 */     if (this.a.size() > 0) { this.b = ((NBTBase)this.a.get(0)).getType(); }
/* 12 */     else { this.b = 1; }
/*    */     
/* 14 */     paramDataOutput.writeByte(this.b);
/* 15 */     paramDataOutput.writeInt(this.a.size());
/* 16 */     for (int b = 0; b < this.a.size(); b++) {
/* 17 */       ((NBTBase)this.a.get(b)).writeTagContents(paramDataOutput);
/*    */     }
/*    */   }
/*    */   
/*    */   void readTagContents(DataInput paramDataInput) throws IOException {
/* 22 */     this.b = paramDataInput.readByte();
/* 23 */     int i = paramDataInput.readInt();
/*    */     
/* 25 */     this.a = new ArrayList();
/* 26 */     for (int b = 0; b < i; b++) {
/* 27 */       NBTBase ft1 = NBTBase.writeTag(this.b);
/* 28 */       ft1.readTagContents(paramDataInput);
/* 29 */       this.a.add(ft1);
/*    */     } 
/*    */   }
/*    */   
/*    */   public byte getType() {
/* 34 */     return 9;
/*    */   }
/*    */   
/*    */   public String toString() {
/* 38 */     return "" + this.a.size() + " entries of type " + NBTBase.readTag(this.b);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(NBTBase paramft) {
/* 53 */     this.b = paramft.getType();
/* 54 */     this.a.add(paramft);
/*    */   }
/*    */   
/*    */   public NBTBase a(int paramInt) {
/* 58 */     return (NBTBase)this.a.get(paramInt);
/*    */   }
/*    */   
/*    */   public int b() {
/* 62 */     return this.a.size();
/*    */   }
/*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\de.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */