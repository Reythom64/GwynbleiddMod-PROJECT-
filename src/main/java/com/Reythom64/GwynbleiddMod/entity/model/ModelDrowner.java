package com.Reythom64.GwynbleiddMod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;

public class ModelDrowner extends ModelBase {
    public ModelRenderer BrasDroit;
    public ModelRenderer JambeDroite;
    public ModelRenderer Tete;
    public ModelRenderer Corps;
    public ModelRenderer BrasGauche;
    public ModelRenderer JambeGauche;
    public ModelRenderer BrasDroitBas;
    public ModelRenderer BrasGaucheBas;
    public ModelRenderer JambeDroiteBas;
    public ModelRenderer JambeGaucheBas;

    public ModelDrowner() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.Corps = new ModelRenderer(this, 16, 16);
        this.Corps.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Corps.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F);
        this.JambeGauche = new ModelRenderer(this, 0, 16);
        this.JambeGauche.mirror = true;
        this.JambeGauche.setRotationPoint(2.4F, 11.9F, 0.3F);
        this.JambeGauche.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4, 0.0F);
        this.setRotateAngle(JambeGauche, -0.3246312408709453F, -0.19442967867216832F, 0.0F);
        this.JambeGaucheBas = new ModelRenderer(this, 0, 16);
        this.JambeGaucheBas.setRotationPoint(1.3F, 17.0F, -3.7F);
        this.JambeGaucheBas.addBox(0.0F, 0.0F, 0.0F, 4, 7, 3, 0.0F);
        this.setRotateAngle(JambeGaucheBas, 0.1662248450421675F, -0.21642082724729686F, 0.0F);
        this.Tete = new ModelRenderer(this, 0, 0);
        this.Tete.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.Tete.addBox(-4.0F, -8.0F, -4.0F, 7, 8, 8, 0.0F);
        this.BrasDroitBas = new ModelRenderer(this, 40, 16);
        this.BrasDroitBas.setRotationPoint(-7.4F, 5.6F, -1.2F);
        this.BrasDroitBas.addBox(0.0F, 0.0F, 0.0F, 4, 8, 4, 0.0F);
        this.setRotateAngle(BrasDroitBas, -0.44488442633335457F, 0.0F, 0.06018531864320167F);
        this.BrasGauche = new ModelRenderer(this, 40, 16);
        this.BrasGauche.mirror = true;
        this.BrasGauche.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.BrasGauche.addBox(-1.0F, -2.0F, -2.0F, 4, 8, 4, 0.0F);
        this.setRotateAngle(BrasGauche, -0.017453292519943295F, 0.10000736613927509F, -0.10000736613927509F);
        this.JambeDroiteBas = new ModelRenderer(this, 0, 16);
        this.JambeDroiteBas.setRotationPoint(-4.6F, 17.0F, -3.3F);
        this.JambeDroiteBas.addBox(0.0F, 0.0F, 0.0F, 4, 7, 3, 0.0F);
        this.setRotateAngle(JambeDroiteBas, 0.16615534478986016F, 0.21642082724729686F, 0.0F);
        this.BrasDroit = new ModelRenderer(this, 40, 16);
        this.BrasDroit.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.BrasDroit.addBox(-3.0F, -2.0F, -2.0F, 4, 8, 4, 0.0F);
        this.setRotateAngle(BrasDroit, -0.017453292519943295F, -0.12409290981679683F, 0.10000736613927509F);
        this.JambeDroite = new ModelRenderer(this, 0, 16);
        this.JambeDroite.setRotationPoint(-1.9F, 12.0F, 0.1F);
        this.JambeDroite.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4, 0.0F);
        this.setRotateAngle(JambeDroite, -0.3246312408709453F, 0.2405063709248186F, 0.0F);
        this.BrasGaucheBas = new ModelRenderer(this, 40, 16);
        this.BrasGaucheBas.setRotationPoint(4.7F, 5.5F, -1.2F);
        this.BrasGaucheBas.addBox(0.0F, 0.0F, 0.0F, 4, 8, 4, 0.0F);
        this.setRotateAngle(BrasGaucheBas, -0.44488442633335457F, 0.0F, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Corps.render(f5);
        this.JambeGauche.render(f5);
        this.JambeGaucheBas.render(f5);
        this.Tete.render(f5);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.BrasDroitBas.offsetX, this.BrasDroitBas.offsetY, this.BrasDroitBas.offsetZ);
        GlStateManager.translate(this.BrasDroitBas.rotationPointX * f5, this.BrasDroitBas.rotationPointY * f5, this.BrasDroitBas.rotationPointZ * f5);
        GlStateManager.scale(0.7D, 1.0D, 0.8D);
        GlStateManager.translate(-this.BrasDroitBas.offsetX, -this.BrasDroitBas.offsetY, -this.BrasDroitBas.offsetZ);
        GlStateManager.translate(-this.BrasDroitBas.rotationPointX * f5, -this.BrasDroitBas.rotationPointY * f5, -this.BrasDroitBas.rotationPointZ * f5);
        this.BrasDroitBas.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.BrasGauche.offsetX, this.BrasGauche.offsetY, this.BrasGauche.offsetZ);
        GlStateManager.translate(this.BrasGauche.rotationPointX * f5, this.BrasGauche.rotationPointY * f5, this.BrasGauche.rotationPointZ * f5);
        GlStateManager.scale(0.7D, 1.0D, 0.9D);
        GlStateManager.translate(-this.BrasGauche.offsetX, -this.BrasGauche.offsetY, -this.BrasGauche.offsetZ);
        GlStateManager.translate(-this.BrasGauche.rotationPointX * f5, -this.BrasGauche.rotationPointY * f5, -this.BrasGauche.rotationPointZ * f5);
        this.BrasGauche.render(f5);
        GlStateManager.popMatrix();
        this.JambeDroiteBas.render(f5);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.BrasDroit.offsetX, this.BrasDroit.offsetY, this.BrasDroit.offsetZ);
        GlStateManager.translate(this.BrasDroit.rotationPointX * f5, this.BrasDroit.rotationPointY * f5, this.BrasDroit.rotationPointZ * f5);
        GlStateManager.scale(0.7D, 1.0D, 0.8D);
        GlStateManager.translate(-this.BrasDroit.offsetX, -this.BrasDroit.offsetY, -this.BrasDroit.offsetZ);
        GlStateManager.translate(-this.BrasDroit.rotationPointX * f5, -this.BrasDroit.rotationPointY * f5, -this.BrasDroit.rotationPointZ * f5);
        this.BrasDroit.render(f5);
        GlStateManager.popMatrix();
        this.JambeDroite.render(f5);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.BrasGaucheBas.offsetX, this.BrasGaucheBas.offsetY, this.BrasGaucheBas.offsetZ);
        GlStateManager.translate(this.BrasGaucheBas.rotationPointX * f5, this.BrasGaucheBas.rotationPointY * f5, this.BrasGaucheBas.rotationPointZ * f5);
        GlStateManager.scale(0.7D, 1.0D, 0.8D);
        GlStateManager.translate(-this.BrasGaucheBas.offsetX, -this.BrasGaucheBas.offsetY, -this.BrasGaucheBas.offsetZ);
        GlStateManager.translate(-this.BrasGaucheBas.rotationPointX * f5, -this.BrasGaucheBas.rotationPointY * f5, -this.BrasGaucheBas.rotationPointZ * f5);
        this.BrasGaucheBas.render(f5);
        GlStateManager.popMatrix();
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
